package com.yftech.service.main.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yftech.service.main.a.h;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static volatile c a = null;
    private static final String d = "car_policy";
    private static final String e = "media_source";
    private static final String f = "last_focus_stack";
    private static final String m = "request";
    private static final String n = "abandon";
    private static final String o = "passive abandon";
    private static final String p = "recover";
    private static final String q = "mute abandon";
    private static final int u = 3000;
    private String A;
    private String B;
    private int C;
    private InterfaceC0010c G;
    private Context b;
    private SharedPreferences c;
    private e g;
    private AudioManager i;
    private h j;
    private com.yftech.service.main.c.a.d.a t;
    private String w;
    private String x;
    private final List<com.yftech.service.main.c.a.d.a> k = new LinkedList();
    private Map<Integer, com.yftech.service.main.c.a.d> l = new HashMap();
    private List<String> r = new ArrayList();
    private a v = new a();
    private int y = -1;
    private int z = -1;
    private boolean D = false;
    private long E = 0;
    private List<b> F = new ArrayList();
    private Handler s = new Handler(Looper.myLooper());
    private com.yftech.service.main.c.a.b h = com.yftech.service.main.c.a.b.a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.yftech.service.main.c.a.d.a unused = c.this.t;
        }
    }

    public static class b {
        public void a(String str, int i, String str2) {
        }

        public void a(String str, int i, String str2, int i2) {
        }

        public void b(String str, int i, String str2, int i2) {
        }
    }

    /* JADX INFO: renamed from: com.yftech.service.main.b.c$c, reason: collision with other inner class name */
    interface InterfaceC0010c {
        void a(int i, String str, String str2, int i2);

        void a(boolean z);
    }

    private c(Context context) throws Throwable {
        this.C = -1;
        this.b = context;
        this.j = com.yftech.service.main.a.a.a(context).h();
        this.c = this.b.getSharedPreferences(d, 0);
        this.g = e.a(context);
        this.i = (AudioManager) this.b.getSystemService("audio");
        String string = this.c.getString(e, null);
        if (!TextUtils.isEmpty(string)) {
            String[] strArrSplit = string.split(com.yftech.service.main.c.a.b.a);
            if (strArrSplit.length >= 3) {
                this.C = Integer.parseInt(strArrSplit[0]);
                this.A = "null".equals(strArrSplit[1]) ? null : strArrSplit[1];
                this.B = "null".equals(strArrSplit[2]) ? null : strArrSplit[2];
            } else {
                com.yftech.service.main.j.a.e("CarSourceManager, media source data error");
            }
        }
        if (com.yftech.service.main.j.b.a()) {
            final String string2 = this.c.getString(f, null);
            new Thread(new Runnable() { // from class: com.yftech.service.main.b.c.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    com.yftech.service.main.j.a.c("last focus stack: " + string2);
                    if (TextUtils.isEmpty(string2)) {
                        return;
                    }
                    for (String str : string2.split(com.yftech.service.main.c.a.b.a)) {
                        c.this.i.handleClientAudioFocus(str, -1);
                    }
                }
            }, "focus.loss").start();
        }
        this.c.edit().putString(f, "").apply();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x02eb A[Catch: Exception -> 0x033d, all -> 0x0517, TryCatch #3 {Exception -> 0x033d, blocks: (B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333), top: B:190:0x02e5 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x030f A[Catch: Exception -> 0x033d, all -> 0x0517, LOOP:8: B:117:0x0309->B:119:0x030f, LOOP_END, TryCatch #3 {Exception -> 0x033d, blocks: (B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333), top: B:190:0x02e5 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0352  */
    /* JADX WARN: Code duplicated, block: B:141:0x03cd A[Catch: all -> 0x0517, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x03d9 A[Catch: all -> 0x0517, LOOP:2: B:142:0x03d3->B:144:0x03d9, LOOP_END, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x03e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x03ea A[Catch: all -> 0x0517, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x03f4 A[Catch: all -> 0x0517, LOOP:3: B:149:0x03ee->B:151:0x03f4, LOOP_END, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0428 A[Catch: all -> 0x0517, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0432 A[Catch: all -> 0x0517, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0473  */
    /* JADX WARN: Code duplicated, block: B:159:0x0476 A[Catch: all -> 0x0517, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0490 A[Catch: all -> 0x0517, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x049a A[Catch: all -> 0x0517, LOOP:5: B:163:0x0494->B:165:0x049a, LOOP_END, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x04cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x04ce A[Catch: all -> 0x0517, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x04d8 A[Catch: all -> 0x0517, LOOP:6: B:168:0x04d2->B:170:0x04d8, LOOP_END, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x04f0 A[Catch: all -> 0x0517, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x04f5 A[Catch: all -> 0x0517, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x04ff A[Catch: all -> 0x0517, LOOP:7: B:175:0x04f9->B:177:0x04ff, LOOP_END, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0120 A[Catch: Exception -> 0x037c, all -> 0x0517, TRY_LEAVE, TryCatch #5 {Exception -> 0x037c, blocks: (B:17:0x00a4, B:46:0x0116, B:48:0x0120), top: B:193:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x012e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0165 A[Catch: Exception -> 0x015e, all -> 0x0517, TRY_LEAVE, TryCatch #2 {Exception -> 0x015e, blocks: (B:52:0x0140, B:55:0x0165), top: B:188:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8 A[Catch: Exception -> 0x034e, all -> 0x0517, TryCatch #1 {Exception -> 0x034e, blocks: (B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206), top: B:185:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ba A[Catch: Exception -> 0x034e, all -> 0x0517, TryCatch #1 {Exception -> 0x034e, blocks: (B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206), top: B:185:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0 A[Catch: Exception -> 0x034e, all -> 0x0517, TryCatch #1 {Exception -> 0x034e, blocks: (B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206), top: B:185:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01c4 A[Catch: Exception -> 0x034e, all -> 0x0517, TryCatch #1 {Exception -> 0x034e, blocks: (B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206), top: B:185:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ca A[Catch: Exception -> 0x034e, all -> 0x0517, TryCatch #1 {Exception -> 0x034e, blocks: (B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206), top: B:185:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce A[Catch: Exception -> 0x034e, all -> 0x0517, TryCatch #1 {Exception -> 0x034e, blocks: (B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206), top: B:185:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0206 A[Catch: Exception -> 0x034e, all -> 0x0517, TRY_LEAVE, TryCatch #1 {Exception -> 0x034e, blocks: (B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206), top: B:185:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x020e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0213  */
    /* JADX WARN: Code duplicated, block: B:79:0x0215  */
    /* JADX WARN: Code duplicated, block: B:81:0x0218  */
    /* JADX WARN: Code duplicated, block: B:82:0x021b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0238 A[Catch: Exception -> 0x0348, all -> 0x0517, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0247 A[Catch: Exception -> 0x0348, all -> 0x0517, TRY_LEAVE, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x025d A[Catch: Exception -> 0x02d2, all -> 0x0517, TRY_LEAVE, TryCatch #7 {, blocks: (B:8:0x0077, B:10:0x007c, B:12:0x0084, B:14:0x0090, B:15:0x0099, B:17:0x00a4, B:20:0x00ab, B:22:0x00b1, B:24:0x00ba, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:31:0x00e3, B:33:0x00e5, B:35:0x00ef, B:36:0x00f5, B:38:0x00fb, B:40:0x0105, B:42:0x0107, B:46:0x0116, B:48:0x0120, B:52:0x0140, B:109:0x02e5, B:111:0x02eb, B:114:0x02f7, B:116:0x02fd, B:117:0x0309, B:119:0x030f, B:120:0x0333, B:138:0x0384, B:139:0x03a1, B:141:0x03cd, B:142:0x03d3, B:144:0x03d9, B:145:0x03e3, B:148:0x03ea, B:149:0x03ee, B:151:0x03f4, B:153:0x0428, B:154:0x042c, B:156:0x0432, B:160:0x047e, B:159:0x0476, B:162:0x0490, B:163:0x0494, B:165:0x049a, B:178:0x0515, B:167:0x04ce, B:168:0x04d2, B:170:0x04d8, B:172:0x04f0, B:174:0x04f5, B:175:0x04f9, B:177:0x04ff, B:55:0x0165, B:58:0x0194, B:60:0x01a0, B:62:0x01a8, B:64:0x01ba, B:66:0x01c0, B:71:0x0200, B:67:0x01c4, B:69:0x01ca, B:70:0x01ce, B:73:0x0206, B:84:0x022c, B:86:0x0238, B:87:0x0241, B:89:0x0247, B:90:0x024e, B:91:0x0253, B:92:0x0257, B:94:0x025d, B:96:0x0291, B:97:0x02c3, B:131:0x0354), top: B:196:0x0077 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x03f4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:165:0x049a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0165, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01ce, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x025d, please report this as an issue */
    private int a(int i, String str, IBinder iBinder, String str2, int i2, List<Map.Entry<com.yftech.service.main.c.a.a, com.yftech.service.main.c.a.d.a>> list) throws Throwable {
        ArrayList<com.yftech.service.main.c.a.d.a> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList<com.yftech.service.main.c.a.d.a> arrayList4;
        Iterator<Map.Entry<com.yftech.service.main.c.a.a, com.yftech.service.main.c.a.d.a>> it;
        Iterator<Map.Entry<com.yftech.service.main.c.a.a, com.yftech.service.main.c.a.d.a>> it2;
        String str3;
        Iterator<b> it3;
        String strC;
        com.yftech.service.main.c.a.d dVarD;
        int i3;
        com.yftech.service.main.c.a.d.a aVarA;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        ArrayList arrayList8;
        Iterator it4;
        com.yftech.service.main.c.a.d.a aVar;
        com.yftech.service.main.c.a.a aVarC;
        int i6 = 0;
        if (!this.j.b(i, str, str2)) {
            com.yftech.service.main.j.a.c("requestFocus, not allow request, streamType:" + i + ",callPackageName:" + str2 + ",clinetId:" + str + ",callingPid:" + i2);
            return 0;
        }
        int iA = this.j.a(i, str, str2);
        com.yftech.service.main.j.a.c("requestFocus streamType:" + iA + ",callPackageName:" + str2 + ",clinetId:" + str + ",callingPid:" + i2);
        synchronized (this.k) {
            if (this.t != null && this.t.c() == iA && this.t.a().equals(str)) {
                this.t = null;
                this.s.removeCallbacks(this.v);
            }
            com.yftech.service.main.c.a.e eVarB = this.h.b(iA);
            com.yftech.service.main.c.a.c cVarE = eVarB.e();
            try {
                com.yftech.service.main.c.a.d.a aVarA2 = a(iA, str);
                if (aVarA2 != null) {
                    try {
                        if (!aVarA2.d()) {
                            s();
                            if (!d(aVarA2)) {
                                com.yftech.service.main.j.a.c("repeated focus filtering,delayed!(当前禁用)");
                                aVarA2.b(false);
                                if (list == null) {
                                    Iterator<b> it5 = this.F.iterator();
                                    while (it5.hasNext()) {
                                        it5.next().a(str2, iA, str, 2);
                                    }
                                }
                                return 2;
                            }
                            com.yftech.service.main.j.a.c("repeated focus filtering,pass!(放行)");
                            aVarA2.b(true);
                            this.g.a(cVarE.b());
                            if (list == null) {
                                Iterator<b> it6 = this.F.iterator();
                                while (it6.hasNext()) {
                                    it6.next().a(str2, iA, str, 1);
                                }
                            }
                            return 1;
                        }
                        this.k.remove(aVarA2);
                        strC = eVarB.c();
                        try {
                            if (TextUtils.isEmpty(strC)) {
                                arrayList = null;
                                com.yftech.service.main.j.a.d("request focus error,the stream type:" + iA + " no use policy!(该StreamType[" + iA + "]不在声源控制范围,没有可使用的策略)");
                                arrayList4 = null;
                                arrayList2 = null;
                                i6 = 0;
                            } else {
                                dVarD = eVarB.d();
                                if (this.k.isEmpty()) {
                                    try {
                                        if (dVarD != null) {
                                            i6 = 1;
                                            arrayList = null;
                                            aVarA = dVarD.a(str, str2, iA, false, true, iBinder, i2);
                                            this.k.add(aVarA);
                                            this.g.a(cVarE.b());
                                            com.yftech.service.main.j.a.c("the first!(首个音频焦点)");
                                            i3 = 1;
                                            arrayList2 = null;
                                            arrayList5 = null;
                                        } else {
                                            i6 = 1;
                                            arrayList = null;
                                            com.yftech.service.main.j.a.d("request focus error,the use key:" + strC + " no policy!(没有对应StreamType[" + iA + "]策略表)");
                                            i3 = 1;
                                            arrayList2 = null;
                                            aVarA = null;
                                            arrayList5 = null;
                                        }
                                        if (i6 == i3 && dVarD != null) {
                                            try {
                                                if (dVarD.c() && !dVarD.d().isEmpty() && aVarA != null && b(aVarA)) {
                                                    for (Map.Entry<Integer, Integer> entry : dVarD.d().entrySet()) {
                                                        this.g.a(entry.getKey().intValue(), entry.getValue().intValue(), cVarE.b());
                                                    }
                                                    this.l.put(Integer.valueOf(iA), dVarD);
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                arrayList3 = arrayList;
                                                arrayList = arrayList5;
                                                com.yftech.service.main.j.a.d("request audio facus error:" + e.getMessage());
                                                e.printStackTrace();
                                                arrayList4 = arrayList3;
                                            }
                                        }
                                        arrayList4 = arrayList;
                                        arrayList = arrayList5;
                                    } catch (Exception e3) {
                                        e = e3;
                                        arrayList2 = arrayList;
                                        arrayList3 = arrayList2;
                                        com.yftech.service.main.j.a.d("request audio facus error:" + e.getMessage());
                                        e.printStackTrace();
                                        arrayList4 = arrayList3;
                                    }
                                } else {
                                    arrayList = null;
                                    arrayList6 = new ArrayList();
                                    arrayList7 = new ArrayList();
                                    i4 = 1;
                                    for (i5 = 0; i5 < this.k.size(); i5++) {
                                        try {
                                            aVar = this.k.get(i5);
                                            aVarC = aVar.f().c(iA);
                                            if (aVarC != null) {
                                                com.yftech.service.main.j.a.c("current source(" + aVar.c() + com.yftech.service.main.c.a.b.a + aVar.a() + ") no action to " + iA + ",forbidden !but the request will be added to the stack!(当前声源禁止申请,但此次申请将加入堆栈)");
                                                i4 = 2;
                                            } else if (aVarC.b()) {
                                                arrayList6.add(aVar);
                                            } else if (aVarC.a()) {
                                                arrayList7.add(aVar);
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            i6 = i4;
                                            arrayList2 = arrayList;
                                            arrayList3 = arrayList2;
                                            com.yftech.service.main.j.a.d("request audio facus error:" + e.getMessage());
                                            e.printStackTrace();
                                            arrayList4 = arrayList3;
                                        }
                                    }
                                    if (i4 == 1) {
                                        arrayList5 = new ArrayList(arrayList7);
                                    } else {
                                        arrayList5 = null;
                                    }
                                    if (i4 == 2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i4 != 2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    i6 = i4;
                                    try {
                                        aVarA = dVarD.a(str, str2, iA, z, z2, iBinder, i2);
                                        this.k.add(aVarA);
                                        if (i6 == 1) {
                                            this.g.a(cVarE.b());
                                        }
                                        if (arrayList6.isEmpty()) {
                                            arrayList2 = null;
                                        } else {
                                            arrayList8 = new ArrayList(arrayList6);
                                            try {
                                                arrayList2 = new ArrayList();
                                                try {
                                                    it4 = arrayList6.iterator();
                                                    while (it4.hasNext()) {
                                                        com.yftech.service.main.c.a.d.a aVar2 = (com.yftech.service.main.c.a.d.a) it4.next();
                                                        com.yftech.service.main.j.a.c("remove mutex policy stack::::remove streamType:" + aVar2.c() + ",clientId:" + aVar2.a());
                                                        arrayList3 = arrayList8;
                                                        try {
                                                            a(aVar2.c(), aVar2.a(), q, new int[0]);
                                                            a(aVar2.c() + com.yftech.service.main.c.a.b.a + aVar2.a(), arrayList2);
                                                            arrayList8 = arrayList3;
                                                            it4 = it4;
                                                            aVarA = aVarA;
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            arrayList = arrayList5;
                                                            com.yftech.service.main.j.a.d("request audio facus error:" + e.getMessage());
                                                            e.printStackTrace();
                                                            arrayList4 = arrayList3;
                                                            s();
                                                            com.yftech.service.main.j.a.c("request audio facus,streamType:" + iA + ",return result::" + i6);
                                                            a(iA, str, m, i6);
                                                            if (list == null) {
                                                                it3 = this.F.iterator();
                                                                while (it3.hasNext()) {
                                                                    it3.next().a(str2, iA, str, i6);
                                                                }
                                                            }
                                                            r();
                                                            if (list == null) {
                                                                if (arrayList != null) {
                                                                    for (com.yftech.service.main.c.a.d.a aVar3 : arrayList) {
                                                                        a(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.a), aVar3.a(), aVar3);
                                                                        com.yftech.service.main.j.a.c("requestFocus, notify audio focus client(" + aVar3.a() + ") for action(interrupt) at interrupt");
                                                                    }
                                                                }
                                                                if (arrayList2 != null) {
                                                                    for (Map.Entry<com.yftech.service.main.c.a.a, com.yftech.service.main.c.a.d.a> entry2 : arrayList2) {
                                                                        a(entry2.getKey(), entry2.getValue().a(), entry2.getValue());
                                                                        StringBuilder sb = new StringBuilder();
                                                                        sb.append("requestFocus, notify audio focus client(");
                                                                        sb.append(entry2.getValue().a());
                                                                        sb.append(") for action(");
                                                                        if (entry2.getKey() == null) {
                                                                            str3 = "null";
                                                                        } else {
                                                                            str3 = entry2.getKey().f;
                                                                        }
                                                                        sb.append(str3);
                                                                        sb.append(") at abandon");
                                                                        com.yftech.service.main.j.a.c(sb.toString());
                                                                    }
                                                                }
                                                                if (arrayList4 != null) {
                                                                    for (com.yftech.service.main.c.a.d.a aVar4 : arrayList4) {
                                                                        a(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.b), aVar4.a(), aVar4);
                                                                        com.yftech.service.main.j.a.c("requestFocus, notify audio focus client(" + aVar4.a() + ") for action(mutex) at mutex");
                                                                    }
                                                                }
                                                            } else {
                                                                if (arrayList != null) {
                                                                    it2 = arrayList.iterator();
                                                                    while (it2.hasNext()) {
                                                                        list.add(new AbstractMap.SimpleEntry(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.a), (com.yftech.service.main.c.a.d.a) it2.next()));
                                                                    }
                                                                }
                                                                if (arrayList2 != null) {
                                                                    list.addAll(arrayList2);
                                                                }
                                                                if (arrayList4 != null) {
                                                                    it = arrayList4.iterator();
                                                                    while (it.hasNext()) {
                                                                        list.add(new AbstractMap.SimpleEntry(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.b), (com.yftech.service.main.c.a.d.a) it.next()));
                                                                    }
                                                                }
                                                            }
                                                            return i6;
                                                        }
                                                    }
                                                    arrayList3 = arrayList8;
                                                    com.yftech.service.main.c.a.d.a aVar5 = aVarA;
                                                    arrayList6.clear();
                                                    arrayList = arrayList3;
                                                    aVarA = aVar5;
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    arrayList3 = arrayList8;
                                                }
                                            } catch (Exception e7) {
                                                e = e7;
                                                arrayList3 = arrayList8;
                                                arrayList2 = null;
                                            }
                                        }
                                        i3 = 1;
                                        if (i6 == i3) {
                                            if (dVarD.c()) {
                                                while (r2.hasNext()) {
                                                    this.g.a(entry.getKey().intValue(), entry.getValue().intValue(), cVarE.b());
                                                }
                                                this.l.put(Integer.valueOf(iA), dVarD);
                                            }
                                        }
                                        arrayList4 = arrayList;
                                        arrayList = arrayList5;
                                    } catch (Exception e8) {
                                        e = e8;
                                        arrayList2 = null;
                                        arrayList3 = null;
                                    }
                                }
                            }
                        } catch (Exception e9) {
                            e = e9;
                            arrayList2 = null;
                            arrayList3 = arrayList2;
                            i6 = 1;
                            com.yftech.service.main.j.a.d("request audio facus error:" + e.getMessage());
                            e.printStackTrace();
                            arrayList4 = arrayList3;
                            s();
                            com.yftech.service.main.j.a.c("request audio facus,streamType:" + iA + ",return result::" + i6);
                            a(iA, str, m, i6);
                            if (list == null) {
                                it3 = this.F.iterator();
                                while (it3.hasNext()) {
                                    it3.next().a(str2, iA, str, i6);
                                }
                            }
                            r();
                            if (list == null) {
                                if (arrayList != null) {
                                    while (r2.hasNext()) {
                                        a(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.a), aVar3.a(), aVar3);
                                        com.yftech.service.main.j.a.c("requestFocus, notify audio focus client(" + aVar3.a() + ") for action(interrupt) at interrupt");
                                    }
                                }
                                if (arrayList2 != null) {
                                    while (r2.hasNext()) {
                                        a(entry2.getKey(), entry2.getValue().a(), entry2.getValue());
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("requestFocus, notify audio focus client(");
                                        sb2.append(entry2.getValue().a());
                                        sb2.append(") for action(");
                                        if (entry2.getKey() == null) {
                                            str3 = "null";
                                        } else {
                                            str3 = entry2.getKey().f;
                                        }
                                        sb2.append(str3);
                                        sb2.append(") at abandon");
                                        com.yftech.service.main.j.a.c(sb2.toString());
                                    }
                                }
                                if (arrayList4 != null) {
                                    while (r0.hasNext()) {
                                        a(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.b), aVar4.a(), aVar4);
                                        com.yftech.service.main.j.a.c("requestFocus, notify audio focus client(" + aVar4.a() + ") for action(mutex) at mutex");
                                    }
                                }
                            } else {
                                if (arrayList != null) {
                                    it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        list.add(new AbstractMap.SimpleEntry(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.a), (com.yftech.service.main.c.a.d.a) it2.next()));
                                    }
                                }
                                if (arrayList2 != null) {
                                    list.addAll(arrayList2);
                                }
                                if (arrayList4 != null) {
                                    it = arrayList4.iterator();
                                    while (it.hasNext()) {
                                        list.add(new AbstractMap.SimpleEntry(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.b), (com.yftech.service.main.c.a.d.a) it.next()));
                                    }
                                }
                            }
                            return i6;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        i6 = 1;
                        arrayList2 = null;
                        arrayList = null;
                        arrayList3 = null;
                        com.yftech.service.main.j.a.d("request audio facus error:" + e.getMessage());
                        e.printStackTrace();
                        arrayList4 = arrayList3;
                        s();
                        com.yftech.service.main.j.a.c("request audio facus,streamType:" + iA + ",return result::" + i6);
                        a(iA, str, m, i6);
                        if (list == null) {
                            it3 = this.F.iterator();
                            while (it3.hasNext()) {
                                it3.next().a(str2, iA, str, i6);
                            }
                        }
                        r();
                        if (list == null) {
                            if (arrayList != null) {
                                while (r2.hasNext()) {
                                    a(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.a), aVar3.a(), aVar3);
                                    com.yftech.service.main.j.a.c("requestFocus, notify audio focus client(" + aVar3.a() + ") for action(interrupt) at interrupt");
                                }
                            }
                            if (arrayList2 != null) {
                                while (r2.hasNext()) {
                                    a(entry2.getKey(), entry2.getValue().a(), entry2.getValue());
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("requestFocus, notify audio focus client(");
                                    sb3.append(entry2.getValue().a());
                                    sb3.append(") for action(");
                                    if (entry2.getKey() == null) {
                                        str3 = "null";
                                    } else {
                                        str3 = entry2.getKey().f;
                                    }
                                    sb3.append(str3);
                                    sb3.append(") at abandon");
                                    com.yftech.service.main.j.a.c(sb3.toString());
                                }
                            }
                            if (arrayList4 != null) {
                                while (r0.hasNext()) {
                                    a(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.b), aVar4.a(), aVar4);
                                    com.yftech.service.main.j.a.c("requestFocus, notify audio focus client(" + aVar4.a() + ") for action(mutex) at mutex");
                                }
                            }
                        } else {
                            if (arrayList != null) {
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    list.add(new AbstractMap.SimpleEntry(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.a), (com.yftech.service.main.c.a.d.a) it2.next()));
                                }
                            }
                            if (arrayList2 != null) {
                                list.addAll(arrayList2);
                            }
                            if (arrayList4 != null) {
                                it = arrayList4.iterator();
                                while (it.hasNext()) {
                                    list.add(new AbstractMap.SimpleEntry(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.b), (com.yftech.service.main.c.a.d.a) it.next()));
                                }
                            }
                        }
                        return i6;
                    }
                } else {
                    strC = eVarB.c();
                    if (TextUtils.isEmpty(strC)) {
                        dVarD = eVarB.d();
                        if (this.k.isEmpty()) {
                            if (dVarD != null) {
                                i6 = 1;
                                arrayList = null;
                                aVarA = dVarD.a(str, str2, iA, false, true, iBinder, i2);
                                this.k.add(aVarA);
                                this.g.a(cVarE.b());
                                com.yftech.service.main.j.a.c("the first!(首个音频焦点)");
                                i3 = 1;
                                arrayList2 = null;
                                arrayList5 = null;
                            } else {
                                i6 = 1;
                                arrayList = null;
                                com.yftech.service.main.j.a.d("request focus error,the use key:" + strC + " no policy!(没有对应StreamType[" + iA + "]策略表)");
                                i3 = 1;
                                arrayList2 = null;
                                aVarA = null;
                                arrayList5 = null;
                            }
                            if (i6 == i3) {
                                if (dVarD.c()) {
                                    while (r2.hasNext()) {
                                        this.g.a(entry.getKey().intValue(), entry.getValue().intValue(), cVarE.b());
                                    }
                                    this.l.put(Integer.valueOf(iA), dVarD);
                                }
                            }
                            arrayList4 = arrayList;
                            arrayList = arrayList5;
                        } else {
                            arrayList = null;
                            arrayList6 = new ArrayList();
                            arrayList7 = new ArrayList();
                            i4 = 1;
                            while (i5 < this.k.size()) {
                                aVar = this.k.get(i5);
                                aVarC = aVar.f().c(iA);
                                if (aVarC != null) {
                                    com.yftech.service.main.j.a.c("current source(" + aVar.c() + com.yftech.service.main.c.a.b.a + aVar.a() + ") no action to " + iA + ",forbidden !but the request will be added to the stack!(当前声源禁止申请,但此次申请将加入堆栈)");
                                    i4 = 2;
                                } else if (aVarC.b()) {
                                    arrayList6.add(aVar);
                                } else if (aVarC.a()) {
                                    arrayList7.add(aVar);
                                }
                            }
                            if (i4 == 1) {
                                arrayList5 = new ArrayList(arrayList7);
                            } else {
                                arrayList5 = null;
                            }
                            if (i4 == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i4 != 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i6 = i4;
                            aVarA = dVarD.a(str, str2, iA, z, z2, iBinder, i2);
                            this.k.add(aVarA);
                            if (i6 == 1) {
                                this.g.a(cVarE.b());
                            }
                            if (arrayList6.isEmpty()) {
                                arrayList8 = new ArrayList(arrayList6);
                                arrayList2 = new ArrayList();
                                it4 = arrayList6.iterator();
                                while (it4.hasNext()) {
                                    com.yftech.service.main.c.a.d.a aVar6 = (com.yftech.service.main.c.a.d.a) it4.next();
                                    com.yftech.service.main.j.a.c("remove mutex policy stack::::remove streamType:" + aVar6.c() + ",clientId:" + aVar6.a());
                                    arrayList3 = arrayList8;
                                    a(aVar6.c(), aVar6.a(), q, new int[0]);
                                    a(aVar6.c() + com.yftech.service.main.c.a.b.a + aVar6.a(), arrayList2);
                                    arrayList8 = arrayList3;
                                    it4 = it4;
                                    aVarA = aVarA;
                                }
                                arrayList3 = arrayList8;
                                com.yftech.service.main.c.a.d.a aVar7 = aVarA;
                                arrayList6.clear();
                                arrayList = arrayList3;
                                aVarA = aVar7;
                            } else {
                                arrayList2 = null;
                            }
                            i3 = 1;
                            if (i6 == i3) {
                                if (dVarD.c()) {
                                    while (r2.hasNext()) {
                                        this.g.a(entry.getKey().intValue(), entry.getValue().intValue(), cVarE.b());
                                    }
                                    this.l.put(Integer.valueOf(iA), dVarD);
                                }
                            }
                            arrayList4 = arrayList;
                            arrayList = arrayList5;
                        }
                    } else {
                        arrayList = null;
                        com.yftech.service.main.j.a.d("request focus error,the stream type:" + iA + " no use policy!(该StreamType[" + iA + "]不在声源控制范围,没有可使用的策略)");
                        arrayList4 = null;
                        arrayList2 = null;
                        i6 = 0;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                arrayList = null;
            }
            s();
            com.yftech.service.main.j.a.c("request audio facus,streamType:" + iA + ",return result::" + i6);
            a(iA, str, m, i6);
            if (list == null) {
                it3 = this.F.iterator();
                while (it3.hasNext()) {
                    it3.next().a(str2, iA, str, i6);
                }
            }
            r();
            if (list == null) {
                if (arrayList != null) {
                    while (r2.hasNext()) {
                        a(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.a), aVar3.a(), aVar3);
                        com.yftech.service.main.j.a.c("requestFocus, notify audio focus client(" + aVar3.a() + ") for action(interrupt) at interrupt");
                    }
                }
                if (arrayList2 != null) {
                    while (r2.hasNext()) {
                        a(entry2.getKey(), entry2.getValue().a(), entry2.getValue());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("requestFocus, notify audio focus client(");
                        sb4.append(entry2.getValue().a());
                        sb4.append(") for action(");
                        if (entry2.getKey() == null) {
                            str3 = "null";
                        } else {
                            str3 = entry2.getKey().f;
                        }
                        sb4.append(str3);
                        sb4.append(") at abandon");
                        com.yftech.service.main.j.a.c(sb4.toString());
                    }
                }
                if (arrayList4 != null) {
                    while (r0.hasNext()) {
                        a(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.b), aVar4.a(), aVar4);
                        com.yftech.service.main.j.a.c("requestFocus, notify audio focus client(" + aVar4.a() + ") for action(mutex) at mutex");
                    }
                }
            } else {
                if (arrayList != null) {
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        list.add(new AbstractMap.SimpleEntry(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.a), (com.yftech.service.main.c.a.d.a) it2.next()));
                    }
                }
                if (arrayList2 != null) {
                    list.addAll(arrayList2);
                }
                if (arrayList4 != null) {
                    it = arrayList4.iterator();
                    while (it.hasNext()) {
                        list.add(new AbstractMap.SimpleEntry(new com.yftech.service.main.c.a.a(com.yftech.service.main.c.a.a.b), (com.yftech.service.main.c.a.d.a) it.next()));
                    }
                }
            }
            return i6;
        }
    }

    public static c a(Context context) {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c(context);
                }
            }
        }
        return a;
    }

    private com.yftech.service.main.c.a.d.a a(int i, String str) throws Exception {
        if (i < 0 || TextUtils.isEmpty(str)) {
            throw new Exception("the streamType is:" + i + ",clientId is " + str);
        }
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.yftech.service.main.c.a.d.a aVar = this.k.get(i2);
            if (str.equals(aVar.a()) && i == aVar.c()) {
                return aVar;
            }
        }
        return null;
    }

    private synchronized void a(int i, String str, String str2, int... iArr) {
        String str3;
        if (this.r.size() >= 50) {
            this.r.remove(0);
        }
        List<String> list = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append(com.yftech.service.main.j.a.a());
        sb.append(" ");
        sb.append(str2);
        sb.append(":");
        sb.append(i);
        sb.append(com.yftech.service.main.c.a.b.a);
        sb.append(str);
        if (iArr == null || iArr.length <= 0) {
            str3 = "";
        } else {
            str3 = "|" + iArr[0];
        }
        sb.append(str3);
        list.add(sb.toString());
    }

    private void a(com.yftech.service.main.c.a.a aVar, String str, com.yftech.service.main.c.a.d.a aVar2) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("has ");
        sb.append(aVar == null ? "recovery" : aVar.f);
        sb.append(" policy audio source coming in(有一个");
        sb.append(aVar == null ? "recovery" : aVar.f);
        sb.append("关系的源进来)!");
        com.yftech.service.main.j.a.c(sb.toString());
        if (aVar == null) {
            com.yftech.service.main.j.a.c("hander client audio focus AUDIOFOCUS_GAIN! streamType:" + aVar2.c() + ", clientId:" + str);
            aVar2.b(true);
            this.i.handleClientAudioFocus(str, 1);
            Iterator<b> it = this.F.iterator();
            while (it.hasNext()) {
                it.next().b(aVar2.b(), aVar2.c(), str, 1);
            }
            return;
        }
        if (aVar.a()) {
            com.yftech.service.main.j.a.c("hander client audio focus AUDIOFOCUS_LOSS_TRANSIENT! streamType:" + aVar2.c() + ", clientId:" + str);
            aVar2.b(false);
            this.i.handleClientAudioFocus(str, -2);
            if (aVar2 != null && aVar2.f() != null && this.h.b(aVar2.f())) {
                this.E = SystemClock.uptimeMillis();
            }
            Iterator<b> it2 = this.F.iterator();
            while (it2.hasNext()) {
                it2.next().b(aVar2.b(), aVar2.c(), str, -2);
            }
            return;
        }
        if (!aVar.b()) {
            aVar.d();
            return;
        }
        com.yftech.service.main.j.a.c("hander client audio focus AUDIOFOCUS_LOSS! streamType:" + aVar2.c() + ", clientId:" + str);
        aVar2.b(false);
        this.i.handleClientAudioFocus(str, -1);
        if (aVar2 != null && aVar2.f() != null && this.h.b(aVar2.f())) {
            this.E = SystemClock.uptimeMillis();
        }
        Iterator<b> it3 = this.F.iterator();
        while (it3.hasNext()) {
            it3.next().b(aVar2.b(), aVar2.c(), str, -1);
        }
    }

    private boolean a(com.yftech.service.main.c.a.d.a aVar) throws Throwable {
        boolean z = false;
        boolean z2 = (aVar == null || aVar.d()) ? false : true;
        if (z2) {
            int iB = this.h.b(aVar.c()).e().b();
            for (int i = 0; i < this.k.size(); i++) {
                com.yftech.service.main.c.a.d.a aVar2 = this.k.get(i);
                if (aVar2 == null || aVar.f().d() == null || aVar2.d() || !aVar.f().a().equals(aVar2.f().a()) || iB != this.h.b(aVar2.c()).e().b()) {
                }
            }
            z = z2;
        } else {
            z = z2;
        }
        com.yftech.service.main.j.a.c("isRecoverMixChannelPer:" + z);
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x03f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x03f4 A[Catch: all -> 0x03dd, TryCatch #3 {, blocks: (B:5:0x0010, B:7:0x0016, B:14:0x003b, B:17:0x0052, B:18:0x006d, B:20:0x006f, B:22:0x0072, B:24:0x00a2, B:26:0x00a5, B:29:0x00aa, B:31:0x00af, B:40:0x00e1, B:41:0x00e3, B:42:0x00f7, B:44:0x00fd, B:46:0x0109, B:48:0x010f, B:50:0x0115, B:54:0x0123, B:56:0x012b, B:58:0x0156, B:59:0x015c, B:61:0x0162, B:63:0x017a, B:65:0x0180, B:67:0x018c, B:68:0x0192, B:70:0x0197, B:72:0x019d, B:73:0x01a9, B:75:0x0211, B:112:0x03e5, B:113:0x03ea, B:116:0x03f4, B:117:0x03f8, B:119:0x03fe, B:123:0x044a, B:122:0x0442, B:124:0x045a, B:125:0x045e, B:127:0x0464, B:134:0x04af, B:129:0x0492, B:130:0x0495, B:131:0x0499, B:133:0x049f, B:80:0x026f, B:81:0x027a, B:83:0x0280, B:85:0x028c, B:87:0x029e, B:89:0x02ac, B:90:0x02b0, B:92:0x02b6, B:93:0x02ba, B:95:0x02c0, B:97:0x0310, B:98:0x038f, B:100:0x0397, B:101:0x039a, B:37:0x00bb, B:13:0x0037, B:106:0x03c7), top: B:144:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x03fe A[Catch: all -> 0x03dd, TryCatch #3 {, blocks: (B:5:0x0010, B:7:0x0016, B:14:0x003b, B:17:0x0052, B:18:0x006d, B:20:0x006f, B:22:0x0072, B:24:0x00a2, B:26:0x00a5, B:29:0x00aa, B:31:0x00af, B:40:0x00e1, B:41:0x00e3, B:42:0x00f7, B:44:0x00fd, B:46:0x0109, B:48:0x010f, B:50:0x0115, B:54:0x0123, B:56:0x012b, B:58:0x0156, B:59:0x015c, B:61:0x0162, B:63:0x017a, B:65:0x0180, B:67:0x018c, B:68:0x0192, B:70:0x0197, B:72:0x019d, B:73:0x01a9, B:75:0x0211, B:112:0x03e5, B:113:0x03ea, B:116:0x03f4, B:117:0x03f8, B:119:0x03fe, B:123:0x044a, B:122:0x0442, B:124:0x045a, B:125:0x045e, B:127:0x0464, B:134:0x04af, B:129:0x0492, B:130:0x0495, B:131:0x0499, B:133:0x049f, B:80:0x026f, B:81:0x027a, B:83:0x0280, B:85:0x028c, B:87:0x029e, B:89:0x02ac, B:90:0x02b0, B:92:0x02b6, B:93:0x02ba, B:95:0x02c0, B:97:0x0310, B:98:0x038f, B:100:0x0397, B:101:0x039a, B:37:0x00bb, B:13:0x0037, B:106:0x03c7), top: B:144:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x043f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0442 A[Catch: all -> 0x03dd, TryCatch #3 {, blocks: (B:5:0x0010, B:7:0x0016, B:14:0x003b, B:17:0x0052, B:18:0x006d, B:20:0x006f, B:22:0x0072, B:24:0x00a2, B:26:0x00a5, B:29:0x00aa, B:31:0x00af, B:40:0x00e1, B:41:0x00e3, B:42:0x00f7, B:44:0x00fd, B:46:0x0109, B:48:0x010f, B:50:0x0115, B:54:0x0123, B:56:0x012b, B:58:0x0156, B:59:0x015c, B:61:0x0162, B:63:0x017a, B:65:0x0180, B:67:0x018c, B:68:0x0192, B:70:0x0197, B:72:0x019d, B:73:0x01a9, B:75:0x0211, B:112:0x03e5, B:113:0x03ea, B:116:0x03f4, B:117:0x03f8, B:119:0x03fe, B:123:0x044a, B:122:0x0442, B:124:0x045a, B:125:0x045e, B:127:0x0464, B:134:0x04af, B:129:0x0492, B:130:0x0495, B:131:0x0499, B:133:0x049f, B:80:0x026f, B:81:0x027a, B:83:0x0280, B:85:0x028c, B:87:0x029e, B:89:0x02ac, B:90:0x02b0, B:92:0x02b6, B:93:0x02ba, B:95:0x02c0, B:97:0x0310, B:98:0x038f, B:100:0x0397, B:101:0x039a, B:37:0x00bb, B:13:0x0037, B:106:0x03c7), top: B:144:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0464 A[Catch: all -> 0x03dd, LOOP:4: B:125:0x045e->B:127:0x0464, LOOP_END, TryCatch #3 {, blocks: (B:5:0x0010, B:7:0x0016, B:14:0x003b, B:17:0x0052, B:18:0x006d, B:20:0x006f, B:22:0x0072, B:24:0x00a2, B:26:0x00a5, B:29:0x00aa, B:31:0x00af, B:40:0x00e1, B:41:0x00e3, B:42:0x00f7, B:44:0x00fd, B:46:0x0109, B:48:0x010f, B:50:0x0115, B:54:0x0123, B:56:0x012b, B:58:0x0156, B:59:0x015c, B:61:0x0162, B:63:0x017a, B:65:0x0180, B:67:0x018c, B:68:0x0192, B:70:0x0197, B:72:0x019d, B:73:0x01a9, B:75:0x0211, B:112:0x03e5, B:113:0x03ea, B:116:0x03f4, B:117:0x03f8, B:119:0x03fe, B:123:0x044a, B:122:0x0442, B:124:0x045a, B:125:0x045e, B:127:0x0464, B:134:0x04af, B:129:0x0492, B:130:0x0495, B:131:0x0499, B:133:0x049f, B:80:0x026f, B:81:0x027a, B:83:0x0280, B:85:0x028c, B:87:0x029e, B:89:0x02ac, B:90:0x02b0, B:92:0x02b6, B:93:0x02ba, B:95:0x02c0, B:97:0x0310, B:98:0x038f, B:100:0x0397, B:101:0x039a, B:37:0x00bb, B:13:0x0037, B:106:0x03c7), top: B:144:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0490 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0492 A[Catch: all -> 0x03dd, TryCatch #3 {, blocks: (B:5:0x0010, B:7:0x0016, B:14:0x003b, B:17:0x0052, B:18:0x006d, B:20:0x006f, B:22:0x0072, B:24:0x00a2, B:26:0x00a5, B:29:0x00aa, B:31:0x00af, B:40:0x00e1, B:41:0x00e3, B:42:0x00f7, B:44:0x00fd, B:46:0x0109, B:48:0x010f, B:50:0x0115, B:54:0x0123, B:56:0x012b, B:58:0x0156, B:59:0x015c, B:61:0x0162, B:63:0x017a, B:65:0x0180, B:67:0x018c, B:68:0x0192, B:70:0x0197, B:72:0x019d, B:73:0x01a9, B:75:0x0211, B:112:0x03e5, B:113:0x03ea, B:116:0x03f4, B:117:0x03f8, B:119:0x03fe, B:123:0x044a, B:122:0x0442, B:124:0x045a, B:125:0x045e, B:127:0x0464, B:134:0x04af, B:129:0x0492, B:130:0x0495, B:131:0x0499, B:133:0x049f, B:80:0x026f, B:81:0x027a, B:83:0x0280, B:85:0x028c, B:87:0x029e, B:89:0x02ac, B:90:0x02b0, B:92:0x02b6, B:93:0x02ba, B:95:0x02c0, B:97:0x0310, B:98:0x038f, B:100:0x0397, B:101:0x039a, B:37:0x00bb, B:13:0x0037, B:106:0x03c7), top: B:144:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x049f A[Catch: all -> 0x03dd, LOOP:5: B:131:0x0499->B:133:0x049f, LOOP_END, TryCatch #3 {, blocks: (B:5:0x0010, B:7:0x0016, B:14:0x003b, B:17:0x0052, B:18:0x006d, B:20:0x006f, B:22:0x0072, B:24:0x00a2, B:26:0x00a5, B:29:0x00aa, B:31:0x00af, B:40:0x00e1, B:41:0x00e3, B:42:0x00f7, B:44:0x00fd, B:46:0x0109, B:48:0x010f, B:50:0x0115, B:54:0x0123, B:56:0x012b, B:58:0x0156, B:59:0x015c, B:61:0x0162, B:63:0x017a, B:65:0x0180, B:67:0x018c, B:68:0x0192, B:70:0x0197, B:72:0x019d, B:73:0x01a9, B:75:0x0211, B:112:0x03e5, B:113:0x03ea, B:116:0x03f4, B:117:0x03f8, B:119:0x03fe, B:123:0x044a, B:122:0x0442, B:124:0x045a, B:125:0x045e, B:127:0x0464, B:134:0x04af, B:129:0x0492, B:130:0x0495, B:131:0x0499, B:133:0x049f, B:80:0x026f, B:81:0x027a, B:83:0x0280, B:85:0x028c, B:87:0x029e, B:89:0x02ac, B:90:0x02b0, B:92:0x02b6, B:93:0x02ba, B:95:0x02c0, B:97:0x0310, B:98:0x038f, B:100:0x0397, B:101:0x039a, B:37:0x00bb, B:13:0x0037, B:106:0x03c7), top: B:144:0x0010 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x0464, please report this as an issue */
    private boolean a(String str, List<Map.Entry<com.yftech.service.main.c.a.a, com.yftech.service.main.c.a.d.a>> list) {
        Exception exc;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        String str2;
        Exception exc2;
        int i;
        ArrayList<com.yftech.service.main.c.a.d.a> arrayList3 = new ArrayList();
        synchronized (this.k) {
            try {
                if (TextUtils.isEmpty(str)) {
                    com.yftech.service.main.j.a.c("abandon focus fail! data is " + str);
                    arrayList2 = null;
                } else {
                    String[] strArrSplit = str.split(com.yftech.service.main.c.a.b.a);
                    String str3 = strArrSplit[1];
                    int[] iArrB = b(str3);
                    StringBuilder sb = new StringBuilder();
                    sb.append("abandonFocus data: ");
                    sb.append(iArrB == null ? "null" : Arrays.toString(iArrB));
                    sb.append(com.yftech.service.main.c.a.b.a);
                    sb.append(str3);
                    com.yftech.service.main.j.a.c(sb.toString());
                    if (iArrB == null) {
                        try {
                            com.yftech.service.main.j.a.c("abandonFocus, no this focus request record: " + str);
                            a(Integer.MIN_VALUE, str3, n, new int[0]);
                            return true;
                        } catch (Exception e2) {
                            exc = e2;
                            arrayList = null;
                        }
                    } else {
                        if (iArrB.length > 1) {
                            try {
                                int iA = this.j.a(Integer.parseInt(strArrSplit[0]), str3, null);
                                com.yftech.service.main.j.a.c("abandonFocus, convert stream type, " + Integer.parseInt(strArrSplit[0]) + " to " + iA);
                                i = Integer.MIN_VALUE;
                                for (int i2 : iArrB) {
                                    try {
                                        if (iA == i2) {
                                            i = iA;
                                        }
                                    } catch (Exception e3) {
                                        exc2 = e3;
                                        com.yftech.service.main.j.a.e("abandonFocus, parse stream type(" + strArrSplit[0] + ") to int error: " + exc2.getMessage());
                                    }
                                }
                                if (i == Integer.MIN_VALUE) {
                                    com.yftech.service.main.j.a.c("abandonFocus, stream type of param not in stack");
                                }
                            } catch (Exception e4) {
                                exc2 = e4;
                                i = Integer.MIN_VALUE;
                            }
                        } else {
                            i = Integer.MIN_VALUE;
                        }
                        if (i == Integer.MIN_VALUE) {
                            i = iArrB[0];
                        }
                        int i3 = i;
                        a(i3, str3, n, new int[0]);
                        ArrayList<com.yftech.service.main.c.a.d.a> arrayList4 = new ArrayList();
                        com.yftech.service.main.c.a.d.a aVar = null;
                        for (com.yftech.service.main.c.a.d.a aVar2 : this.k) {
                            if (i3 != aVar2.c()) {
                                if (aVar2.d()) {
                                    arrayList4.add(aVar2);
                                }
                            } else if (str3 != null && str3.equals(aVar2.a())) {
                                aVar = aVar2;
                            }
                        }
                        if (aVar != null && this.k.contains(aVar)) {
                            this.k.remove(aVar);
                            com.yftech.service.main.j.a.c("cur policy stack remove,streamType:" + aVar.c() + ",clientId:" + aVar.a());
                            if (list == null) {
                                Iterator<b> it2 = this.F.iterator();
                                while (it2.hasNext()) {
                                    it2.next().a(aVar.b(), aVar.c(), aVar.a());
                                }
                            }
                            if (aVar != null && aVar.f() != null && this.h.b(aVar.f())) {
                                this.E = SystemClock.uptimeMillis();
                            }
                        }
                        arrayList2 = null;
                        for (com.yftech.service.main.c.a.d.a aVar3 : arrayList4) {
                            try {
                                arrayList = new ArrayList();
                                try {
                                    com.yftech.service.main.c.a.d.a aVar4 = aVar;
                                    int iA2 = a(aVar3.c(), aVar3.a(), aVar3.g(), aVar3.b(), aVar3.h(), arrayList);
                                    com.yftech.service.main.j.a.c("check recover delay focus, streamType:" + aVar3.c() + ", clientId:" + aVar3.a() + ", packageName:" + aVar3.b() + ", pid:" + aVar3.h() + ", result:" + iA2);
                                    if (iA2 == 1) {
                                        com.yftech.service.main.j.a.c("recover delay audio focus streamType:" + aVar3.c() + ", clientId:" + aVar3.a() + ", packageName:" + aVar3.b() + ", pid:" + aVar3.h());
                                        this.t = aVar3;
                                        this.s.removeCallbacks(this.v);
                                        this.s.postDelayed(this.v, 3000L);
                                        arrayList3.add(aVar3);
                                    }
                                    arrayList2 = arrayList;
                                    aVar = aVar4;
                                } catch (Exception e5) {
                                    e = e5;
                                    exc = e;
                                    exc.printStackTrace();
                                    arrayList2 = arrayList;
                                    s();
                                    r();
                                    if (list == null) {
                                        if (arrayList2 != null) {
                                            for (Map.Entry<com.yftech.service.main.c.a.a, com.yftech.service.main.c.a.d.a> entry : arrayList2) {
                                                a(entry.getKey(), entry.getValue().a(), entry.getValue());
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("abandonFocus, notify audio focus client(");
                                                sb2.append(entry.getValue().a());
                                                sb2.append(") for action(");
                                                if (entry.getKey() == null) {
                                                    str2 = "null";
                                                } else {
                                                    str2 = entry.getKey().f;
                                                }
                                                sb2.append(str2);
                                                sb2.append(") at request");
                                                com.yftech.service.main.j.a.c(sb2.toString());
                                            }
                                        }
                                        for (com.yftech.service.main.c.a.d.a aVar5 : arrayList3) {
                                            a(null, aVar5.a(), aVar5);
                                            com.yftech.service.main.j.a.c("abandonFocus, notify audio focus client(" + aVar5.a() + ") for action(gain) at gain");
                                        }
                                    } else {
                                        if (arrayList2 != null) {
                                            list.addAll(arrayList2);
                                        }
                                        it = arrayList3.iterator();
                                        while (it.hasNext()) {
                                            list.add(new AbstractMap.SimpleEntry(null, (com.yftech.service.main.c.a.d.a) it.next()));
                                        }
                                    }
                                    return true;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                arrayList = arrayList2;
                            }
                        }
                        com.yftech.service.main.c.a.d.a aVar6 = aVar;
                        ArrayList<com.yftech.service.main.c.a.d.a> arrayList5 = new ArrayList();
                        for (com.yftech.service.main.c.a.d.a aVar7 : this.k) {
                            if (i3 != aVar7.c() && aVar7.f().e().containsKey(Integer.valueOf(i3)) && aVar7.f().c(i3).a()) {
                                arrayList5.add(aVar7);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            for (com.yftech.service.main.c.a.d.a aVar8 : arrayList5) {
                                boolean zC = c(aVar8);
                                com.yftech.service.main.j.a.c("check recover target policy,streamType:" + aVar8.c() + ",clientId:" + aVar8.a());
                                com.yftech.service.main.j.a.c("is recover audio focus " + aVar8.c() + ",recover:" + zC);
                                if (zC) {
                                    com.yftech.service.main.j.a.c("recover audio focus streamType:" + aVar8.c() + ",clientId:" + aVar8.a() + ",packageName:" + aVar8.b());
                                    this.g.a(this.h.b(aVar8.c()).e().b());
                                    a(aVar8.c(), aVar8.a(), p, new int[0]);
                                    com.yftech.service.main.j.a.c("hander client audio focus AUDIOFOCUS_GAIN! streamType:" + aVar8.c() + ", clientId:" + aVar8.a());
                                    arrayList3.add(aVar8);
                                }
                            }
                        }
                        if (a(aVar6)) {
                            b(i3);
                        }
                        com.yftech.service.main.j.a.c("in abandon focus ::: the policy stack size:" + this.k.size() + ",abandon client data:(" + str + ")");
                    }
                    exc.printStackTrace();
                    arrayList2 = arrayList;
                }
            } catch (Exception e7) {
                exc = e7;
                arrayList = null;
            }
            s();
            r();
            if (list == null) {
                if (arrayList2 != null) {
                    while (r1.hasNext()) {
                        a(entry.getKey(), entry.getValue().a(), entry.getValue());
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("abandonFocus, notify audio focus client(");
                        sb3.append(entry.getValue().a());
                        sb3.append(") for action(");
                        if (entry.getKey() == null) {
                            str2 = "null";
                        } else {
                            str2 = entry.getKey().f;
                        }
                        sb3.append(str2);
                        sb3.append(") at request");
                        com.yftech.service.main.j.a.c(sb3.toString());
                    }
                }
                while (r1.hasNext()) {
                    a(null, aVar5.a(), aVar5);
                    com.yftech.service.main.j.a.c("abandonFocus, notify audio focus client(" + aVar5.a() + ") for action(gain) at gain");
                }
            } else {
                if (arrayList2 != null) {
                    list.addAll(arrayList2);
                }
                it = arrayList3.iterator();
                while (it.hasNext()) {
                    list.add(new AbstractMap.SimpleEntry(null, (com.yftech.service.main.c.a.d.a) it.next()));
                }
            }
            return true;
        }
    }

    private boolean b(com.yftech.service.main.c.a.d.a aVar) throws Throwable {
        boolean z = false;
        boolean z2 = (aVar == null || aVar.d() || aVar.f() == null || !aVar.f().c() || aVar.f().d().isEmpty()) ? false : true;
        if (z2) {
            int iB = this.h.b(aVar.c()).e().b();
            for (int i = 0; i < this.k.size(); i++) {
                com.yftech.service.main.c.a.d.a aVar2 = this.k.get(i);
                int iB2 = this.h.b(aVar2.c()).e().b();
                if (aVar == aVar2 || aVar2.d() || !aVar.f().a().equals(aVar2.f().a()) || iB != iB2) {
                }
            }
            z = z2;
        } else {
            z = z2;
        }
        com.yftech.service.main.j.a.c("isMixChannelPer:" + z);
        return z;
    }

    private boolean c(com.yftech.service.main.c.a.d.a aVar) {
        return d(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    private boolean d(com.yftech.service.main.c.a.d.a aVar) {
        if (aVar == null || this.k.isEmpty()) {
            return false;
        }
        Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                return true;
            }
            com.yftech.service.main.c.a.d.a next = it.next();
            if (next.c() != aVar.c()) {
                if (next.f().e().containsKey(Integer.valueOf(aVar.c()))) {
                    com.yftech.service.main.c.a.a aVar2 = next.f().e().get(Integer.valueOf(aVar.c()));
                    if (!aVar2.a() && !aVar2.d()) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
            }
        }
    }

    private void r() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (com.yftech.service.main.c.a.d.a aVar : this.k) {
            if (z) {
                z = false;
            } else {
                sb.append(com.yftech.service.main.c.a.b.a);
            }
            sb.append(aVar.a());
        }
        this.c.edit().putString(f, sb.toString()).apply();
    }

    private void s() {
        this.y = -1;
        this.w = null;
        this.x = null;
        this.z = -1;
        for (com.yftech.service.main.c.a.d.a aVar : this.k) {
            if (com.yftech.service.main.a.a.a(this.b).a().c(this.h.b(aVar.c()).e().b())) {
                this.y = aVar.c();
                this.w = aVar.b();
                this.x = aVar.a();
                if (aVar.d()) {
                    this.z = 2;
                } else {
                    this.z = 1;
                }
            }
        }
        SharedPreferences.Editor editorEdit = this.c.edit();
        StringBuilder sb = new StringBuilder();
        sb.append(this.y);
        sb.append(com.yftech.service.main.c.a.b.a);
        sb.append(this.w == null ? "null" : this.w);
        sb.append(com.yftech.service.main.c.a.b.a);
        sb.append(this.x == null ? "null" : this.x);
        editorEdit.putString(e, sb.toString()).apply();
        if (this.G != null) {
            this.G.a(this.y, this.w, this.x, this.z);
        }
    }

    public int a() {
        return this.y;
    }

    public int a(int i, String str, IBinder iBinder, String str2, int i2) {
        return a(i, str, iBinder, str2, i2, null);
    }

    public void a(b bVar) {
        if (this.F.contains(bVar)) {
            return;
        }
        this.F.add(bVar);
    }

    public void a(InterfaceC0010c interfaceC0010c) {
        this.G = interfaceC0010c;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println();
        printWriter.println("current media source: " + this.y + com.yftech.service.main.c.a.b.a + this.w + com.yftech.service.main.c.a.b.a + this.x);
        printWriter.println("media source when shutdown: " + this.C + com.yftech.service.main.c.a.b.a + this.A + com.yftech.service.main.c.a.b.a + this.B);
        printWriter.println();
        printWriter.println("policy stack:");
        Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
        if (it.hasNext()) {
            while (it.hasNext()) {
                com.yftech.service.main.c.a.d.a next = it.next();
                printWriter.println(" " + next.c() + "|" + next.d() + "|" + next.e() + "|" + next.b() + "|" + next.a());
            }
            printWriter.println();
        } else {
            printWriter.println(" empty");
        }
        printWriter.println();
        printWriter.println("history stack(max = 50):");
        Iterator<String> it2 = this.r.iterator();
        if (it2.hasNext()) {
            while (it2.hasNext()) {
                printWriter.println(it2.next());
            }
            printWriter.println();
        } else {
            printWriter.println(" empty");
        }
        printWriter.println();
    }

    public void a(boolean z) throws Throwable {
        com.yftech.service.main.j.a.c("setScreenSaver on:" + z);
        this.D = z;
        if (this.G != null) {
            this.G.a(z);
        }
    }

    public boolean a(int i) {
        synchronized (this.k) {
            Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().c() == i) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean a(String str) {
        return a(str, (List<Map.Entry<com.yftech.service.main.c.a.a, com.yftech.service.main.c.a.d.a>>) null);
    }

    public String b() {
        return this.w;
    }

    public void b(int i) throws Throwable {
        com.yftech.service.main.j.a.c("recover mix channel per, streamType:" + i + " has mix policy:" + this.l.containsKey(Integer.valueOf(i)) + ",Cur Mix Actions size:" + this.l.size());
        if (this.l.containsKey(Integer.valueOf(i))) {
            com.yftech.service.main.c.a.d dVar = this.l.get(Integer.valueOf(i));
            com.yftech.service.main.c.a.c cVarE = this.h.b(i).e();
            Iterator<Integer> it = this.l.keySet().iterator();
            boolean z = false;
            int i2 = 0;
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (iIntValue == i) {
                    i2++;
                } else if (this.h.b(iIntValue).e().b() == cVarE.b()) {
                    z = true;
                    break;
                }
            }
            if (i2 < 2 && !z && dVar.c() && !dVar.d().isEmpty()) {
                Iterator<Map.Entry<Integer, Integer>> it2 = dVar.d().entrySet().iterator();
                while (it2.hasNext()) {
                    int iIntValue2 = it2.next().getKey().intValue();
                    int iB = this.h.b(i).e().b();
                    com.yftech.service.main.j.a.c("recover mix channel per,channel:" + iIntValue2 + ",recover channel:" + iB);
                    this.g.a(iIntValue2, iB);
                }
            }
            this.l.remove(Integer.valueOf(i));
        }
    }

    public void b(b bVar) {
        this.F.remove(bVar);
    }

    public int[] b(String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (com.yftech.service.main.c.a.d.a aVar : this.k) {
                if (!TextUtils.isEmpty(aVar.a()) && aVar.a().contains(str)) {
                    com.yftech.service.main.j.a.c("getStreamTypeByClientId streamType:" + aVar.c());
                    arrayList.add(Integer.valueOf(aVar.c()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    public String c() {
        return this.x;
    }

    public int d() {
        return this.C;
    }

    public String e() {
        return this.A;
    }

    public String f() {
        return this.B;
    }

    public boolean g() {
        synchronized (this.k) {
            Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
            while (it.hasNext()) {
                if (this.h.a(it.next().f())) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean h() {
        synchronized (this.k) {
            Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
            while (it.hasNext()) {
                if (this.h.b(it.next().f())) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean i() {
        synchronized (this.k) {
            Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
            while (it.hasNext()) {
                if (this.h.c(it.next().f())) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean j() {
        synchronized (this.k) {
            Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
            while (it.hasNext()) {
                if (this.h.d(it.next().f())) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean k() {
        synchronized (this.k) {
            Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
            while (it.hasNext()) {
                if (this.h.e(it.next().f())) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean l() {
        synchronized (this.k) {
            Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
            while (it.hasNext()) {
                if (this.h.f(it.next().f())) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean m() {
        synchronized (this.k) {
            Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().c() == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean n() {
        synchronized (this.k) {
            Iterator<com.yftech.service.main.c.a.d.a> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().c() == 48) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean o() {
        synchronized (this.k) {
            for (com.yftech.service.main.c.a.d.a aVar : this.k) {
                if (aVar.c() == 23 || aVar.c() == 47 || aVar.c() == 46) {
                    return true;
                }
            }
            return false;
        }
    }

    public int p() {
        int iA;
        int iH;
        synchronized (this.k) {
            iA = this.j.a(this.k);
            int iM = Integer.MIN_VALUE;
            if (iA == Integer.MIN_VALUE) {
                int iC = 3;
                for (com.yftech.service.main.c.a.d.a aVar : this.k) {
                    com.yftech.service.main.c.a.c cVarE = this.h.b(aVar.c()).e();
                    if (cVarE.e() != cVarE.f() || cVarE.e() != 0) {
                        if (cVarE.m() >= 0 && cVarE.m() > iM) {
                            iC = aVar.c();
                            iM = cVarE.m();
                        }
                    }
                }
                iA = iC;
            }
        }
        com.yftech.service.main.c.a.e eVarB = this.h.b(iA);
        if (eVarB == null || !com.yftech.service.main.a.a.a(this.b).a().c(eVarB.e().b()) || (iH = com.yftech.service.main.a.a.a(this.b).a().h()) <= 0 || SystemClock.uptimeMillis() - this.E >= iH) {
            return iA;
        }
        this.E = SystemClock.uptimeMillis();
        return 24;
    }

    public boolean q() throws Throwable {
        com.yftech.service.main.j.a.c("isScreenSaver:" + this.D);
        return this.D;
    }
}
