package com.yftech.service.main.a.c.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends com.yftech.service.main.a.c.a {
    @Override // com.yftech.service.main.a.d
    public String a() {
        return "AC8015";
    }

    @Override // com.yftech.service.main.a.c.a, com.yftech.service.main.a.d
    public void c() {
        super.c();
    }

    @Override // com.yftech.service.main.a.c.a, com.yftech.service.main.a.d
    public void d() {
        super.d();
    }

    @Override // com.yftech.service.main.a.c.a, com.yftech.service.main.a.d
    public String e() {
        String strE = super.e();
        StringBuilder sb = new StringBuilder();
        if (strE != null) {
            sb.append(strE);
        }
        sb.append("platform: ");
        sb.append(a());
        sb.append("\n");
        sb.append("project: ");
        sb.append(b());
        sb.append("\n");
        return sb.toString();
    }
}
