package androidx.appcompat.view;

import h7.d1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends u00.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1896f;

    public j(k kVar) {
        this.f1893c = 0;
        this.f1896f = kVar;
        this.f1894d = false;
        this.f1895e = 0;
    }

    @Override // u00.d, h7.d1
    public void a() {
        switch (this.f1893c) {
            case 1:
                this.f1894d = true;
                break;
        }
    }

    @Override // u00.d, h7.d1
    public final void b() {
        switch (this.f1893c) {
            case 0:
                if (!this.f1894d) {
                    this.f1894d = true;
                    d1 d1Var = ((k) this.f1896f).f1900d;
                    if (d1Var != null) {
                        d1Var.b();
                    }
                    break;
                }
                break;
            default:
                ((androidx.appcompat.widget.h) this.f1896f).f2157a.setVisibility(0);
                break;
        }
    }

    @Override // h7.d1
    public final void c() {
        switch (this.f1893c) {
            case 0:
                int i11 = this.f1895e + 1;
                this.f1895e = i11;
                k kVar = (k) this.f1896f;
                if (i11 == kVar.f1897a.size()) {
                    d1 d1Var = kVar.f1900d;
                    if (d1Var != null) {
                        d1Var.c();
                    }
                    this.f1895e = 0;
                    this.f1894d = false;
                    kVar.f1901e = false;
                }
                break;
            default:
                if (!this.f1894d) {
                    ((androidx.appcompat.widget.h) this.f1896f).f2157a.setVisibility(this.f1895e);
                }
                break;
        }
    }

    public j(androidx.appcompat.widget.h hVar, int i11) {
        this.f1893c = 1;
        this.f1896f = hVar;
        this.f1895e = i11;
        this.f1894d = false;
    }
}
