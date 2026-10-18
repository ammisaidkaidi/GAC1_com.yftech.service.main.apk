package com.yftech.service.main.testui;

import android.app.Fragment;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.yftech.car.audio.CarAudioManager;
import com.yftech.service.main.R;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener, SeekBar.OnSeekBarChangeListener {
    private static final String a = "/sdcard/audio_test";
    private static final int ae = 1;
    private static final String b = "/sdcard/audio_test1";
    private static final String c = "/sdcard/audio_test2";
    private static final String d = "/sdcard/audio_test_track";
    private SeekBar A;
    private SeekBar B;
    private SeekBar C;
    private TextView D;
    private TextView E;
    private TextView F;
    private SeekBar G;
    private SeekBar H;
    private SeekBar I;
    private TextView J;
    private TextView K;
    private TextView L;
    private TextView M;
    private TextView N;
    private EditText O;
    private EditText P;
    private MediaPlayer Q;
    private MediaPlayer R;
    private MediaPlayer S;
    private AudioManager T;
    private int U;
    private AudioTrack W;
    private int X;
    private View e;
    private Spinner f;
    private Spinner g;
    private Spinner h;
    private Spinner i;
    private Spinner j;
    private Spinner k;
    private Spinner l;
    private Button m;
    private Button n;
    private Button o;
    private Button p;
    private Button q;
    private Button r;
    private Button s;
    private Button t;
    private Button u;
    private Button v;
    private Button w;
    private Button x;
    private SeekBar y;
    private SeekBar z;
    private boolean V = false;
    private final String[] Y = {"STREAM_MUSIC", "STREAM_NAVI", "STREAM_GIS", "STREAM_BEEP", "STREAM_ALARM", "STREAM_CAR_ALARM", "STREAM_RADAR", "STREAM_NOTIFICATION", "STREAM_VOICE_ASSISTANT", "STREAM_TTS", "STREAM_VOICE", "STREAM_WECHAT", "STREAM_BACKCAR", "STREAM_DVR", "STREAM_SVC", "STREAM_VOICE_CALL", "STREAM_BLUETOOTH_SCO", "STREAM_PHONE", "STREAM_RING", "STREAM_VOIP", "STREAM_VIDEO", "STREAM_RADIO", "STREAM_A2DP", "STREAM_AUX", "STREAM_CARPLAY", "STREAM_CARLIFE", "STREAM_AUXIN", "STREAM_TBOX", "STREAM_SCREEN", "STREAM_STANDBY", "STREAM_SYSTEM", "STREAM_SYSTEM_ENFORCED", "STREAM_DTMF", "STREAM_ACCESSIBILITY", "STREAM_RDS", "STREAM_ADAS", "STREAM_SMIX", "STREAM_NAVI_CARPLAY", "STREAM_NAVI_CARLIFE", "STREAM_VOICE_CARPLAY", "STREAM_VOICE_CARLIFE", "STREAM_WARNING", "STREAM_PHONE_CARLIFE", "STREAM_PHONE_CARPLAY"};
    private final int[] Z = {3, 24, 11, 25, 4, 38, 28, 5, 17, 9, 26, 27, 12, 29, 36, 0, 6, 21, 2, 22, 18, 19, 20, 30, 33, 34, 16, 23, 32, 31, 1, 7, 8, 10, 13, 14, 15, 39, 40, 41, 42, 48, 44, 43};
    private final String[] aa = {"媒体", "电话", "导航"};
    private final int[] ab = {3, 0, 24};
    private final String[] ac = {"media", "radio", "navi", "phone"};
    private final int[] ad = {1, 2, 3, 4};
    private Handler af = new Handler() { // from class: com.yftech.service.main.testui.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            if (message.arg1 == 0) {
                if (a.this.Q == null || !a.this.Q.isPlaying()) {
                    return;
                }
                int duration = a.this.Q.getDuration();
                int currentPosition = a.this.Q.getCurrentPosition();
                a.this.y.setProgress((currentPosition * 100) / duration);
                TextView textView = a.this.D;
                StringBuilder sb = new StringBuilder();
                int i = currentPosition / 1000;
                sb.append(i / 60);
                sb.append(":");
                sb.append(i % 60);
                textView.setText(sb.toString());
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.arg1 = 0;
                messageObtain.obj = a.this.f;
                a.this.af.sendMessageDelayed(messageObtain, 1000L);
                return;
            }
            if (message.arg1 == 1) {
                if (a.this.R == null || !a.this.R.isPlaying()) {
                    return;
                }
                int duration2 = a.this.R.getDuration();
                int currentPosition2 = a.this.R.getCurrentPosition();
                a.this.z.setProgress((currentPosition2 * 100) / duration2);
                TextView textView2 = a.this.E;
                StringBuilder sb2 = new StringBuilder();
                int i2 = currentPosition2 / 1000;
                sb2.append(i2 / 60);
                sb2.append(":");
                sb2.append(i2 % 60);
                textView2.setText(sb2.toString());
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 1;
                messageObtain2.arg1 = 1;
                messageObtain2.obj = a.this.g;
                a.this.af.sendMessageDelayed(messageObtain2, 1000L);
                return;
            }
            if (message.arg1 == 2 && a.this.S != null && a.this.S.isPlaying()) {
                int duration3 = a.this.S.getDuration();
                int currentPosition3 = a.this.S.getCurrentPosition();
                a.this.A.setProgress((currentPosition3 * 100) / duration3);
                TextView textView3 = a.this.F;
                StringBuilder sb3 = new StringBuilder();
                int i3 = currentPosition3 / 1000;
                sb3.append(i3 / 60);
                sb3.append(":");
                sb3.append(i3 % 60);
                textView3.setText(sb3.toString());
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 1;
                messageObtain3.arg1 = 2;
                messageObtain3.obj = a.this.h;
                a.this.af.sendMessageDelayed(messageObtain3, 1000L);
            }
        }
    };
    private AudioManager.OnAudioFocusChangeListener ag = new AudioManager.OnAudioFocusChangeListener() { // from class: com.yftech.service.main.testui.a.7
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) throws Throwable {
            com.yftech.service.main.j.a.c("onAudioFocusChange1, " + i);
            if (i == 1) {
                a.this.q.setTextColor(-65536);
                if (a.this.Q == null || a.this.Q.isPlaying()) {
                    return;
                }
                a.this.Q.start();
                return;
            }
            if (i == -2 || i == -1) {
                a.this.q.setTextColor(-16776961);
                if (a.this.Q == null || !a.this.Q.isPlaying()) {
                    return;
                }
                a.this.Q.pause();
            }
        }
    };
    private AudioManager.OnAudioFocusChangeListener ah = new AudioManager.OnAudioFocusChangeListener() { // from class: com.yftech.service.main.testui.a.8
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) throws Throwable {
            com.yftech.service.main.j.a.c("onAudioFocusChange1, " + i);
            if (i == 1) {
                a.this.s.setTextColor(-65536);
                if (a.this.R == null || a.this.R.isPlaying()) {
                    return;
                }
                a.this.R.start();
                return;
            }
            if (i == -2 || i == -1) {
                a.this.s.setTextColor(-16776961);
                if (a.this.R == null || !a.this.R.isPlaying()) {
                    return;
                }
                a.this.R.pause();
            }
        }
    };
    private AudioManager.OnAudioFocusChangeListener ai = new AudioManager.OnAudioFocusChangeListener() { // from class: com.yftech.service.main.testui.a.9
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) throws Throwable {
            com.yftech.service.main.j.a.c("onAudioFocusChange2, " + i);
            if (i == 1) {
                a.this.u.setTextColor(-65536);
                if (a.this.R == null || a.this.R.isPlaying()) {
                    return;
                }
                a.this.R.start();
                return;
            }
            if (i == -2 || i == -1) {
                a.this.u.setTextColor(-16776961);
                if (a.this.S == null || !a.this.S.isPlaying()) {
                    return;
                }
                a.this.S.pause();
            }
        }
    };

    /* JADX INFO: renamed from: com.yftech.service.main.testui.a$a, reason: collision with other inner class name */
    class C0014a {
        String a;
        short b;
        short c;
        int d;
        int e;
        short f;
        short g;
        int h;
        int i;

        C0014a() {
        }

        public String toString() {
            return "WAVInfo, type:" + this.a + ", format:" + ((int) this.b) + ", channels:" + ((int) this.c) + ", sampleRate:" + this.d + ", byteRate:" + this.e + ", blockAlign:" + ((int) this.f) + ", bitPerSample:" + ((int) this.g) + ", dataOffset:" + this.h + ", dataSize:" + this.i;
        }
    }

    private C0014a a(InputStream inputStream) {
        C0014a c0014a = new C0014a();
        byte[] bArr = new byte[4];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
        while (true) {
            Arrays.fill(bArr, (byte) 0);
            try {
                if (inputStream.read(bArr) == -1) {
                    break;
                }
                String str = new String(bArr, "utf-8");
                if ("RIFF".equals(str)) {
                    inputStream.skip(4L);
                    byte[] bArr2 = new byte[4];
                    Arrays.fill(bArr2, (byte) 0);
                    inputStream.read(bArr2);
                    c0014a.a = new String(bArr2, "utf-8");
                } else if ("fmt ".equals(str)) {
                    byteBufferAllocate2.clear();
                    inputStream.read(byteBufferAllocate2.array());
                    int i = byteBufferAllocate2.getInt();
                    byteBufferAllocate.clear();
                    inputStream.read(byteBufferAllocate.array());
                    c0014a.b = byteBufferAllocate.getShort();
                    byteBufferAllocate.clear();
                    inputStream.read(byteBufferAllocate.array());
                    c0014a.c = byteBufferAllocate.getShort();
                    byteBufferAllocate2.clear();
                    inputStream.read(byteBufferAllocate2.array());
                    c0014a.d = byteBufferAllocate2.getInt();
                    byteBufferAllocate2.clear();
                    inputStream.read(byteBufferAllocate2.array());
                    c0014a.e = byteBufferAllocate2.getInt();
                    byteBufferAllocate.clear();
                    inputStream.read(byteBufferAllocate.array());
                    c0014a.f = byteBufferAllocate.getShort();
                    byteBufferAllocate.clear();
                    inputStream.read(byteBufferAllocate.array());
                    c0014a.g = byteBufferAllocate.getShort();
                    if (i > 16) {
                        inputStream.skip(i - 16);
                    }
                } else if ("data".equals(str)) {
                    byteBufferAllocate2.clear();
                    inputStream.read(byteBufferAllocate2.array());
                    c0014a.i = byteBufferAllocate2.getInt();
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return c0014a;
    }

    private void a() {
        this.f = (Spinner) this.e.findViewById(R.id.sStreamType);
        this.m = (Button) this.e.findViewById(R.id.btnPlay);
        this.n = (Button) this.e.findViewById(R.id.btnStop);
        this.o = (Button) this.e.findViewById(R.id.btnTrackPlay);
        this.p = (Button) this.e.findViewById(R.id.btnTrackStop);
        this.y = (SeekBar) this.e.findViewById(R.id.sbProgress);
        this.D = (TextView) this.e.findViewById(R.id.tvTime);
        this.G = (SeekBar) this.e.findViewById(R.id.sbVolume);
        this.J = (TextView) this.e.findViewById(R.id.tvVolume);
        this.g = (Spinner) this.e.findViewById(R.id.sFocusStreamType1);
        this.h = (Spinner) this.e.findViewById(R.id.sFocusStreamType2);
        this.s = (Button) this.e.findViewById(R.id.btnRequest1);
        this.u = (Button) this.e.findViewById(R.id.btnRequest2);
        this.t = (Button) this.e.findViewById(R.id.btnAbandon1);
        this.v = (Button) this.e.findViewById(R.id.btnAbandon2);
        this.z = (SeekBar) this.e.findViewById(R.id.sbProgress1);
        this.A = (SeekBar) this.e.findViewById(R.id.sbProgress2);
        this.E = (TextView) this.e.findViewById(R.id.tvTime1);
        this.F = (TextView) this.e.findViewById(R.id.tvTime2);
        this.H = (SeekBar) this.e.findViewById(R.id.sbVolume1);
        this.I = (SeekBar) this.e.findViewById(R.id.sbVolume2);
        this.K = (TextView) this.e.findViewById(R.id.tvVolume1);
        this.L = (TextView) this.e.findViewById(R.id.tvVolume2);
        this.q = (Button) this.e.findViewById(R.id.btnRequest);
        this.r = (Button) this.e.findViewById(R.id.btnAbandon);
        this.i = (Spinner) this.e.findViewById(R.id.sDspChannel);
        this.B = (SeekBar) this.e.findViewById(R.id.sbDspChannelVol);
        this.M = (TextView) this.e.findViewById(R.id.tvDspChannelVol);
        this.j = (Spinner) this.e.findViewById(R.id.sVolumeCurve);
        this.w = (Button) this.e.findViewById(R.id.btnSetVolume);
        this.O = (EditText) this.e.findViewById(R.id.etSetVolume);
        this.N = (TextView) this.e.findViewById(R.id.tvGetVolume);
        this.C = (SeekBar) this.e.findViewById(R.id.sbGetVolume);
        this.k = (Spinner) this.e.findViewById(R.id.sMuteType);
        this.l = (Spinner) this.e.findViewById(R.id.sVolumeType);
        this.x = (Button) this.e.findViewById(R.id.btnSetVolumeTypeVolume);
        this.P = (EditText) this.e.findViewById(R.id.etSetVolumeTypeVolume);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, this.Y);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.f.setAdapter((SpinnerAdapter) arrayAdapter);
        this.g.setAdapter((SpinnerAdapter) arrayAdapter);
        this.h.setAdapter((SpinnerAdapter) arrayAdapter);
        this.k.setAdapter((SpinnerAdapter) arrayAdapter);
        this.l.setAdapter((SpinnerAdapter) arrayAdapter);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, this.ac);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.i.setAdapter((SpinnerAdapter) arrayAdapter2);
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, this.aa);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.j.setAdapter((SpinnerAdapter) arrayAdapter3);
    }

    private void a(C0014a c0014a) throws Throwable {
        if (c0014a.b != 1) {
            return;
        }
        int i = 4;
        int i2 = c0014a.c == 1 ? 4 : 12;
        if (c0014a.g == 8) {
            i = 3;
        } else if (c0014a.g == 16) {
            i = 2;
        }
        int i3 = i;
        int minBufferSize = AudioTrack.getMinBufferSize(c0014a.d, i2, i3);
        this.W = new AudioTrack(this.U, c0014a.d, i2, i3, minBufferSize * 2, 1);
        this.W.play();
        this.X = minBufferSize;
        com.yftech.service.main.j.a.c("audio track stream type:" + this.W.getStreamType());
    }

    private void b() {
        this.m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.p.setOnClickListener(this);
        this.G.setOnSeekBarChangeListener(this);
        this.y.setOnSeekBarChangeListener(this);
        this.s.setOnClickListener(this);
        this.u.setOnClickListener(this);
        this.t.setOnClickListener(this);
        this.v.setOnClickListener(this);
        this.z.setOnSeekBarChangeListener(this);
        this.A.setOnSeekBarChangeListener(this);
        this.H.setOnSeekBarChangeListener(this);
        this.I.setOnSeekBarChangeListener(this);
        this.q.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.w.setOnClickListener(this);
        this.C.setOnSeekBarChangeListener(this);
        this.e.findViewById(R.id.btnPlay1).setOnClickListener(this);
        this.e.findViewById(R.id.btnStop1).setOnClickListener(this);
        this.e.findViewById(R.id.btnPlay2).setOnClickListener(this);
        this.e.findViewById(R.id.btnStop2).setOnClickListener(this);
        this.e.findViewById(R.id.llRoot).setOnClickListener(this);
        this.e.findViewById(R.id.btnMuteChannel).setOnClickListener(this);
        this.e.findViewById(R.id.btnUnmuteChannel).setOnClickListener(this);
        this.e.findViewById(R.id.btnMuteStream).setOnClickListener(this);
        this.e.findViewById(R.id.btnUnmuteStream).setOnClickListener(this);
        this.B.setOnSeekBarChangeListener(this);
        this.f.setOnItemSelectedListener(this);
        this.g.setOnItemSelectedListener(this);
        this.h.setOnItemSelectedListener(this);
        this.k.setOnItemSelectedListener(this);
        this.i.setOnItemSelectedListener(this);
        this.j.setOnItemSelectedListener(this);
        this.x.setOnClickListener(this);
    }

    private void c() {
        int streamMaxVolume = this.T.getStreamMaxVolume(this.U);
        int streamVolume = this.T.getStreamVolume(this.U);
        this.V = true;
        this.G.setMax(streamMaxVolume);
        this.G.setProgress(streamVolume);
        this.H.setMax(streamMaxVolume);
        this.H.setProgress(streamVolume);
        this.I.setMax(streamMaxVolume);
        this.I.setProgress(streamVolume);
        this.V = false;
        this.J.setText(String.valueOf(streamVolume));
        this.K.setText(String.valueOf(streamVolume));
        this.L.setText(String.valueOf(streamVolume));
        int i = this.ab[this.j.getSelectedItemPosition()];
        int streamMaxVolume2 = this.T.getStreamMaxVolume(i);
        int[] volumeForVolumeCurveTest = CarAudioManager.getInstance().getVolumeForVolumeCurveTest(i);
        if (volumeForVolumeCurveTest != null) {
            this.C.setMax(streamMaxVolume2);
            this.C.setProgress(volumeForVolumeCurveTest[0]);
            this.N.setText("[" + volumeForVolumeCurveTest[0] + ", " + (volumeForVolumeCurveTest[1] / 1000.0f) + "]");
        }
    }

    private void d() {
        if (this.Q == null || !this.Q.isPlaying()) {
            this.Q = new MediaPlayer();
            this.Q.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.yftech.service.main.testui.a.10
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer) {
                    a.this.Q.start();
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.arg1 = 0;
                    messageObtain.obj = a.this.f;
                    a.this.af.sendMessage(messageObtain);
                }
            });
            this.Q.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.yftech.service.main.testui.a.11
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, int i, int i2) throws Throwable {
                    com.yftech.service.main.j.a.c("onError, what:" + i + ", extra:" + i2);
                    return false;
                }
            });
            this.Q.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.yftech.service.main.testui.a.12
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    a.this.af.removeMessages(1, a.this.f);
                }
            });
            this.Q.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setLegacyStreamType(this.U).build());
            try {
                this.Q.setDataSource(a);
                this.Q.prepareAsync();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void e() {
        if (this.Q == null || !this.Q.isPlaying()) {
            return;
        }
        this.Q.stop();
        this.Q = null;
    }

    private void f() throws Throwable {
        if (this.W == null || this.W.getPlayState() != 3) {
            try {
                final FileInputStream fileInputStream = new FileInputStream(d);
                C0014a c0014aA = a(fileInputStream);
                if (c0014aA != null) {
                    a(c0014aA);
                    new Thread(new Runnable() { // from class: com.yftech.service.main.testui.a.13
                        @Override // java.lang.Runnable
                        public void run() {
                            byte[] bArr = new byte[a.this.X];
                            while (true) {
                                try {
                                    int i = fileInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    } else if (a.this.W != null) {
                                        a.this.W.write(bArr, 0, i);
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            fileInputStream.close();
                            if (a.this.W != null) {
                                a.this.W.stop();
                                a.this.W.release();
                            }
                        }
                    }).start();
                } else {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void g() {
        if (this.W == null || this.W.getPlayState() != 3) {
            return;
        }
        this.W.stop();
        this.W = null;
    }

    private void h() {
        if (this.R == null || !this.R.isPlaying()) {
            this.R = new MediaPlayer();
            this.R.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.yftech.service.main.testui.a.14
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer) {
                    a.this.R.start();
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.arg1 = 1;
                    messageObtain.obj = a.this.g;
                    a.this.af.sendMessage(messageObtain);
                }
            });
            this.R.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.yftech.service.main.testui.a.2
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, int i, int i2) throws Throwable {
                    com.yftech.service.main.j.a.c("onError1, what:" + i + ", extra:" + i2);
                    return false;
                }
            });
            this.R.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.yftech.service.main.testui.a.3
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    a.this.af.removeMessages(1, a.this.g);
                }
            });
            this.R.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setLegacyStreamType(this.Z[this.g.getSelectedItemPosition()]).build());
            try {
                this.R.setDataSource(b);
                this.R.prepareAsync();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void i() {
        if (this.R == null || !this.R.isPlaying()) {
            return;
        }
        this.R.stop();
        this.R = null;
    }

    private void j() {
        if (this.S == null || !this.S.isPlaying()) {
            this.S = new MediaPlayer();
            this.S.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.yftech.service.main.testui.a.4
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer) {
                    a.this.S.start();
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.arg1 = 2;
                    messageObtain.obj = a.this.h;
                    a.this.af.sendMessage(messageObtain);
                }
            });
            this.S.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.yftech.service.main.testui.a.5
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, int i, int i2) throws Throwable {
                    com.yftech.service.main.j.a.c("onError2, what:" + i + ", extra:" + i2);
                    return false;
                }
            });
            this.S.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.yftech.service.main.testui.a.6
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    a.this.af.removeMessages(1, a.this.h);
                }
            });
            this.R.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setLegacyStreamType(this.Z[this.h.getSelectedItemPosition()]).build());
            try {
                this.S.setDataSource(c);
                this.S.prepareAsync();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void k() {
        if (this.S == null || !this.S.isPlaying()) {
            return;
        }
        this.S.stop();
        this.S = null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int id = view.getId();
        if (id == R.id.llRoot) {
            this.O.clearFocus();
            ((InputMethodManager) getContext().getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow((this.O.hasFocus() ? this.O : this.P).getWindowToken(), 0);
        }
        switch (id) {
            case R.id.btnAbandon /* 2130968578 */:
                this.T.abandonAudioFocus(this.ag);
                this.q.setTextColor(-16776961);
                break;
            case R.id.btnAbandon1 /* 2130968579 */:
                this.T.abandonAudioFocus(this.ah);
                this.s.setTextColor(-16776961);
                break;
            case R.id.btnAbandon2 /* 2130968580 */:
                this.T.abandonAudioFocus(this.ai);
                this.u.setTextColor(-16776961);
                break;
            default:
                switch (id) {
                    case R.id.btnMuteChannel /* 2130968585 */:
                        this.T.adjustStreamVolume(this.Z[this.k.getSelectedItemPosition()], -100, 1);
                        break;
                    case R.id.btnMuteStream /* 2130968586 */:
                        CarAudioManager.getInstance().onlyMuteOneStream(this.Z[this.k.getSelectedItemPosition()], true, 1);
                        break;
                    case R.id.btnPlay /* 2130968587 */:
                        d();
                        break;
                    case R.id.btnPlay1 /* 2130968588 */:
                        h();
                        break;
                    case R.id.btnPlay2 /* 2130968589 */:
                        j();
                        break;
                    case R.id.btnRequest /* 2130968590 */:
                        if (this.T.requestAudioFocus(this.ag, this.Z[this.f.getSelectedItemPosition()], 1) == 1) {
                            this.q.setTextColor(-65536);
                        }
                        break;
                    case R.id.btnRequest1 /* 2130968591 */:
                        if (Build.VERSION.SDK_INT < 28) {
                            if (this.T.requestAudioFocus(this.ah, this.Z[this.g.getSelectedItemPosition()], 1) == 1) {
                                this.s.setTextColor(-65536);
                            }
                        } else if (this.T.requestAudioFocus(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this.ah).setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setLegacyStreamType(this.Z[this.g.getSelectedItemPosition()]).build()).build()) == 1) {
                            this.s.setTextColor(-65536);
                        }
                        break;
                    case R.id.btnRequest2 /* 2130968592 */:
                        if (this.T.requestAudioFocus(this.ai, this.Z[this.h.getSelectedItemPosition()], 1) == 1) {
                            this.u.setTextColor(-65536);
                        }
                        break;
                    default:
                        switch (id) {
                            case R.id.btnSetVolume /* 2130968595 */:
                                try {
                                    float f = Float.parseFloat(this.O.getText().toString());
                                    CarAudioManager.getInstance().setVolumeForVolumeCurveTest(this.ab[this.j.getSelectedItemPosition()], -1, (int) (1000.0f * f));
                                    this.N.setText("[" + this.C.getProgress() + ", " + f + "]");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                                break;
                            case R.id.btnSetVolumeTypeVolume /* 2130968596 */:
                                try {
                                    float f2 = Float.parseFloat(this.P.getText().toString());
                                    com.yftech.service.main.j.a.c("onClick, set stream(" + this.Z[this.l.getSelectedItemPosition()] + ") result is " + com.yftech.service.main.a.d.a.a(this.Z[this.l.getSelectedItemPosition()], f2) + " for volume " + f2);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                                break;
                            default:
                                switch (id) {
                                    case R.id.btnStop /* 2130968598 */:
                                        e();
                                        break;
                                    case R.id.btnStop1 /* 2130968599 */:
                                        i();
                                        break;
                                    case R.id.btnStop2 /* 2130968600 */:
                                        k();
                                        break;
                                    case R.id.btnTrackPlay /* 2130968601 */:
                                        f();
                                        break;
                                    case R.id.btnTrackStop /* 2130968602 */:
                                        g();
                                        break;
                                    case R.id.btnUnmuteChannel /* 2130968603 */:
                                        this.T.adjustStreamVolume(this.Z[this.k.getSelectedItemPosition()], 100, 1);
                                        break;
                                    case R.id.btnUnmuteStream /* 2130968604 */:
                                        CarAudioManager.getInstance().onlyMuteOneStream(this.Z[this.k.getSelectedItemPosition()], false, 1);
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = layoutInflater.inflate(R.layout.audio_volume_fragment, viewGroup, false);
        this.T = (AudioManager) getContext().getApplicationContext().getSystemService("audio");
        a();
        b();
        return this.e;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        switch (adapterView.getId()) {
            case R.id.sFocusStreamType1 /* 2130968661 */:
                int i2 = this.Z[i];
                int streamMaxVolume = this.T.getStreamMaxVolume(i2);
                int streamVolume = this.T.getStreamVolume(i2);
                this.V = true;
                this.H.setMax(streamMaxVolume);
                this.H.setProgress(streamVolume);
                this.V = false;
                this.K.setText(String.valueOf(streamVolume));
                break;
            case R.id.sFocusStreamType2 /* 2130968662 */:
                int i3 = this.Z[i];
                int streamMaxVolume2 = this.T.getStreamMaxVolume(i3);
                int streamVolume2 = this.T.getStreamVolume(i3);
                this.V = true;
                this.I.setMax(streamMaxVolume2);
                this.I.setProgress(streamVolume2);
                this.V = false;
                this.L.setText(String.valueOf(streamVolume2));
                break;
            case R.id.sStreamType /* 2130968665 */:
                int i4 = this.Z[i];
                if (i4 != this.U) {
                    this.U = i4;
                    int streamMaxVolume3 = this.T.getStreamMaxVolume(this.U);
                    int streamVolume3 = this.T.getStreamVolume(this.U);
                    this.V = true;
                    this.G.setMax(streamMaxVolume3);
                    this.G.setProgress(streamVolume3);
                    this.V = false;
                    this.J.setText(String.valueOf(streamVolume3));
                }
                break;
            case R.id.sVolumeCurve /* 2130968666 */:
                int i5 = this.ab[i];
                int streamMaxVolume4 = this.T.getStreamMaxVolume(i5);
                int[] volumeForVolumeCurveTest = CarAudioManager.getInstance().getVolumeForVolumeCurveTest(i5);
                if (volumeForVolumeCurveTest != null) {
                    this.C.setMax(streamMaxVolume4);
                    this.C.setProgress(volumeForVolumeCurveTest[0]);
                    this.N.setText("[" + volumeForVolumeCurveTest[0] + ", " + (volumeForVolumeCurveTest[1] / 1000.0f) + "]");
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            switch (seekBar.getId()) {
                case R.id.sbDspChannelVol /* 2130968669 */:
                    int i2 = this.ad[this.i.getSelectedItemPosition()];
                    break;
                case R.id.sbGetVolume /* 2130968671 */:
                    int i3 = this.ab[this.j.getSelectedItemPosition()];
                    CarAudioManager.getInstance().setVolumeForVolumeCurveTest(i3, i, 0);
                    int[] volumeForVolumeCurveTest = CarAudioManager.getInstance().getVolumeForVolumeCurveTest(i3);
                    if (volumeForVolumeCurveTest != null) {
                        this.N.setText("[" + volumeForVolumeCurveTest[0] + ", " + (volumeForVolumeCurveTest[1] / 1000.0f) + "]");
                    }
                    break;
                case R.id.sbProgress /* 2130968672 */:
                    if (this.Q != null) {
                        this.Q.seekTo((i * this.Q.getDuration()) / 100);
                        break;
                    }
                    break;
                case R.id.sbProgress1 /* 2130968673 */:
                    if (this.R != null) {
                        this.R.seekTo((i * this.R.getDuration()) / 100);
                        break;
                    }
                    break;
                case R.id.sbProgress2 /* 2130968674 */:
                    if (this.S != null) {
                        this.S.seekTo((i * this.S.getDuration()) / 100);
                        break;
                    }
                    break;
                case R.id.sbVolume /* 2130968675 */:
                    this.J.setText(String.valueOf(i));
                    this.T.setStreamVolume(this.U, i, 0);
                    break;
                case R.id.sbVolume1 /* 2130968676 */:
                    this.K.setText(String.valueOf(i));
                    this.T.setStreamVolume(this.Z[this.g.getSelectedItemPosition()], i, 0);
                    break;
                case R.id.sbVolume2 /* 2130968677 */:
                    this.L.setText(String.valueOf(i));
                    this.T.setStreamVolume(this.Z[this.h.getSelectedItemPosition()], i, 0);
                    break;
            }
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
