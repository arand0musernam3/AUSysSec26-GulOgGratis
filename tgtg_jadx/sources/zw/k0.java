package zw;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f48261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f48262b;

    public k0(float f11) {
        this.f48261a = f11;
        this.f48262b = e2.f48191px;
    }

    public final float a(q2 q2Var) {
        float fSqrt;
        if (this.f48262b != e2.percent) {
            return d(q2Var);
        }
        o2 o2Var = (o2) q2Var.f48335c;
        h4.a aVar = o2Var.f48317g;
        if (aVar == null) {
            aVar = o2Var.f48316f;
        }
        float f11 = this.f48261a;
        if (aVar == null) {
            return f11;
        }
        float f12 = aVar.f21376d;
        if (f12 == aVar.f21377e) {
            fSqrt = f11 * f12;
        } else {
            fSqrt = f11 * ((float) (Math.sqrt((r0 * r0) + (f12 * f12)) / 1.414213562373095d));
        }
        return fSqrt / 100.0f;
    }

    public final float b(q2 q2Var, float f11) {
        return this.f48262b == e2.percent ? (this.f48261a * f11) / 100.0f : d(q2Var);
    }

    public final float c() {
        float f11;
        float f12;
        int i11 = w.f48374a[this.f48262b.ordinal()];
        float f13 = this.f48261a;
        if (i11 == 1) {
            return f13;
        }
        switch (i11) {
            case 4:
                return f13 * 96.0f;
            case 5:
                f11 = f13 * 96.0f;
                f12 = 2.54f;
                break;
            case 6:
                f11 = f13 * 96.0f;
                f12 = 25.4f;
                break;
            case 7:
                f11 = f13 * 96.0f;
                f12 = 72.0f;
                break;
            case 8:
                f11 = f13 * 96.0f;
                f12 = 6.0f;
                break;
            default:
                return f13;
        }
        return f11 / f12;
    }

    public final float d(q2 q2Var) {
        float textSize;
        int i11 = w.f48374a[this.f48262b.ordinal()];
        float f11 = this.f48261a;
        switch (i11) {
            case 2:
                textSize = ((o2) q2Var.f48335c).f48314d.getTextSize();
                break;
            case 3:
                textSize = ((o2) q2Var.f48335c).f48314d.getTextSize() / 2.0f;
                break;
            case 4:
                q2Var.getClass();
                return f11 * 96.0f;
            case 5:
                q2Var.getClass();
                return (f11 * 96.0f) / 2.54f;
            case 6:
                q2Var.getClass();
                return (f11 * 96.0f) / 25.4f;
            case 7:
                q2Var.getClass();
                return (f11 * 96.0f) / 72.0f;
            case 8:
                q2Var.getClass();
                return (f11 * 96.0f) / 6.0f;
            case 9:
                o2 o2Var = (o2) q2Var.f48335c;
                h4.a aVar = o2Var.f48317g;
                if (aVar == null) {
                    aVar = o2Var.f48316f;
                }
                if (aVar != null) {
                    return (f11 * aVar.f21376d) / 100.0f;
                }
            default:
                return f11;
        }
        return textSize * f11;
    }

    public final float f(q2 q2Var) {
        if (this.f48262b != e2.percent) {
            return d(q2Var);
        }
        o2 o2Var = (o2) q2Var.f48335c;
        h4.a aVar = o2Var.f48317g;
        if (aVar == null) {
            aVar = o2Var.f48316f;
        }
        float f11 = this.f48261a;
        return aVar == null ? f11 : (f11 * aVar.f21377e) / 100.0f;
    }

    public final boolean h() {
        return this.f48261a < 0.0f;
    }

    public final boolean i() {
        return this.f48261a == 0.0f;
    }

    public final String toString() {
        return String.valueOf(this.f48261a) + this.f48262b;
    }

    public k0(float f11, e2 e2Var) {
        this.f48261a = f11;
        this.f48262b = e2Var;
    }
}
