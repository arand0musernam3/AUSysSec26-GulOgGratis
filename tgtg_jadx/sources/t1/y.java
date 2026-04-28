package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface y extends i {
    @Override // t1.i
    default x1 a(v1 v1Var) {
        return new com.google.firebase.messaging.a0(this);
    }

    float b(float f11, float f12, long j9, float f13);

    long c(float f11, float f12, float f13);

    default float d(float f11, float f12, float f13) {
        return e(f11, f12, c(f11, f12, f13), f13);
    }

    float e(float f11, float f12, long j9, float f13);
}
