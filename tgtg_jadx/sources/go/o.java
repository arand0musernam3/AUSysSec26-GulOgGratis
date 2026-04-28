package go;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f20740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f20741c;

    public /* synthetic */ o(float f11, float f12, int i11) {
        this.f20739a = i11;
        this.f20740b = f11;
        this.f20741c = f12;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f20739a) {
            case 0:
                i4.h hVar = (i4.h) obj;
                hVar.getClass();
                ((z5.m) obj3).getClass();
                long j9 = ((h4.e) obj2).f21392a;
                float f11 = this.f20740b;
                oo.e.a(hVar, j9, f11, f11, this.f20741c);
                break;
            default:
                i4.h hVar2 = (i4.h) obj;
                hVar2.getClass();
                ((z5.m) obj3).getClass();
                long j11 = ((h4.e) obj2).f21392a;
                float f12 = this.f20740b;
                oo.e.a(hVar2, j11, f12, f12, this.f20741c);
                break;
        }
        return Unit.f26487a;
    }
}
