package yc;

import android.graphics.Bitmap;
import ax.g0;
import ed.k;
import ia0.c0;
import ia0.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import q90.g;
import q90.p0;
import q90.t;
import q90.y;
import q90.z;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f45831f;

    public b(d0 d0Var) {
        m mVar = m.NONE;
        final int i11 = 0;
        this.f45826a = l.a(mVar, new Function0(this) { // from class: yc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f45825b;

            {
                this.f45825b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i12 = i11;
                b bVar = this.f45825b;
                switch (i12) {
                    case 0:
                        g gVar = g.f36491n;
                        return p30.b.B(bVar.f45831f);
                    default:
                        String strB = bVar.f45831f.b("Content-Type");
                        if (strB == null) {
                            return null;
                        }
                        Regex regex = z.f36633e;
                        try {
                            return y.a(strB);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        final char c3 = 1 == true ? 1 : 0;
        this.f45827b = l.a(mVar, new Function0(this) { // from class: yc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f45825b;

            {
                this.f45825b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i12 = c3;
                b bVar = this.f45825b;
                switch (i12) {
                    case 0:
                        g gVar = g.f36491n;
                        return p30.b.B(bVar.f45831f);
                    default:
                        String strB = bVar.f45831f.b("Content-Type");
                        if (strB == null) {
                            return null;
                        }
                        Regex regex = z.f36633e;
                        try {
                            return y.a(strB);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f45828c = Long.parseLong(d0Var.D(LongCompanionObject.MAX_VALUE));
        this.f45829d = Long.parseLong(d0Var.D(LongCompanionObject.MAX_VALUE));
        this.f45830e = Integer.parseInt(d0Var.D(LongCompanionObject.MAX_VALUE)) > 0;
        int i12 = Integer.parseInt(d0Var.D(LongCompanionObject.MAX_VALUE));
        g0 g0Var = new g0(3);
        for (int i13 = 0; i13 < i12; i13++) {
            String strD = d0Var.D(LongCompanionObject.MAX_VALUE);
            Bitmap.Config[] configArr = k.f15927a;
            int iF = StringsKt.F(strD, ':', 0, false, 6);
            if (iF == -1) {
                i4.a.i("Unexpected header: ".concat(strD));
                throw null;
            }
            g0Var.e(StringsKt.e0(strD.substring(0, iF)).toString(), strD.substring(iF + 1));
        }
        this.f45831f = g0Var.g();
    }

    public final void a(c0 c0Var) {
        c0Var.s0(this.f45828c);
        c0Var.writeByte(10);
        c0Var.s0(this.f45829d);
        c0Var.writeByte(10);
        c0Var.s0(this.f45830e ? 1L : 0L);
        c0Var.writeByte(10);
        t tVar = this.f45831f;
        c0Var.s0(tVar.size());
        c0Var.writeByte(10);
        int size = tVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            c0Var.M(tVar.d(i11));
            c0Var.M(": ");
            c0Var.M(tVar.g(i11));
            c0Var.writeByte(10);
        }
    }

    public b(p0 p0Var) {
        m mVar = m.NONE;
        final int i11 = 0;
        this.f45826a = l.a(mVar, new Function0(this) { // from class: yc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f45825b;

            {
                this.f45825b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i12 = i11;
                b bVar = this.f45825b;
                switch (i12) {
                    case 0:
                        g gVar = g.f36491n;
                        return p30.b.B(bVar.f45831f);
                    default:
                        String strB = bVar.f45831f.b("Content-Type");
                        if (strB == null) {
                            return null;
                        }
                        Regex regex = z.f36633e;
                        try {
                            return y.a(strB);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        final int i12 = 1;
        this.f45827b = l.a(mVar, new Function0(this) { // from class: yc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f45825b;

            {
                this.f45825b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i122 = i12;
                b bVar = this.f45825b;
                switch (i122) {
                    case 0:
                        g gVar = g.f36491n;
                        return p30.b.B(bVar.f45831f);
                    default:
                        String strB = bVar.f45831f.b("Content-Type");
                        if (strB == null) {
                            return null;
                        }
                        Regex regex = z.f36633e;
                        try {
                            return y.a(strB);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f45828c = p0Var.l;
        this.f45829d = p0Var.f36593m;
        this.f45830e = p0Var.f36586e != null;
        this.f45831f = p0Var.f36587f;
    }
}
