package zw;

import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f48256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f48257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f48258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f48259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48260e = false;

    public j2(float f11, float f12, float f13, float f14) {
        this.f48258c = 0.0f;
        this.f48259d = 0.0f;
        this.f48256a = f11;
        this.f48257b = f12;
        double dSqrt = Math.sqrt((f14 * f14) + (f13 * f13));
        if (dSqrt != 0.0d) {
            this.f48258c = (float) (((double) f13) / dSqrt);
            this.f48259d = (float) (((double) f14) / dSqrt);
        }
    }

    public final void a(float f11, float f12) {
        float f13 = f11 - this.f48256a;
        float f14 = f12 - this.f48257b;
        double dSqrt = Math.sqrt((f14 * f14) + (f13 * f13));
        if (dSqrt != 0.0d) {
            f13 = (float) (((double) f13) / dSqrt);
            f14 = (float) (((double) f14) / dSqrt);
        }
        float f15 = this.f48258c;
        if (f13 != (-f15) || f14 != (-this.f48259d)) {
            this.f48258c = f15 + f13;
            this.f48259d += f14;
        } else {
            this.f48260e = true;
            this.f48258c = -f14;
            this.f48259d = f13;
        }
    }

    public final void b(j2 j2Var) {
        float f11 = j2Var.f48258c;
        float f12 = this.f48258c;
        if (f11 == (-f12)) {
            float f13 = j2Var.f48259d;
            if (f13 == (-this.f48259d)) {
                this.f48260e = true;
                this.f48258c = -f13;
                this.f48259d = j2Var.f48258c;
                return;
            }
        }
        this.f48258c = f12 + f11;
        this.f48259d += j2Var.f48259d;
    }

    public final String toString() {
        return "(" + this.f48256a + MessageLogView.COMMA_SEPARATOR + this.f48257b + " " + this.f48258c + MessageLogView.COMMA_SEPARATOR + this.f48259d + ")";
    }
}
