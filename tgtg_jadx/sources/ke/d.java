package ke;

import d6.i0;
import java.util.List;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b, i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26300b;

    public d(List list) {
        this.f26299a = -1.0f;
        this.f26300b = (we.a) list.get(0);
    }

    @Override // ke.b
    public boolean b(float f11) {
        if (this.f26299a == f11) {
            return true;
        }
        this.f26299a = f11;
        return false;
    }

    @Override // ke.b
    public we.a c() {
        return (we.a) this.f26300b;
    }

    @Override // ke.b
    public boolean d(float f11) {
        return !((we.a) this.f26300b).c();
    }

    @Override // d6.i0
    public long e(z5.k kVar, long j9, z5.m mVar, long j11) {
        kVar.getClass();
        mVar.getClass();
        long jE = ((z) this.f26300b).e(0L);
        return (((long) (((int) Float.intBitsToFloat((int) (jE >> 32))) - ((int) this.f26299a))) << 32) | (((long) (((int) Float.intBitsToFloat((int) (jE & 4294967295L))) - ((int) (j11 & 4294967295L)))) & 4294967295L);
    }

    @Override // ke.b
    public float g() {
        return ((we.a) this.f26300b).a();
    }

    @Override // ke.b
    public boolean isEmpty() {
        return false;
    }

    @Override // ke.b
    public float l() {
        return ((we.a) this.f26300b).b();
    }

    public /* synthetic */ d(float f11, Object obj) {
        this.f26300b = obj;
        this.f26299a = f11;
    }
}
