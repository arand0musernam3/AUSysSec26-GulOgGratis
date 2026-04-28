package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13775b;

    public e(int i11) {
        this.f13774a = i11;
        switch (i11) {
            case 1:
                this.f13775b = 0;
                break;
            case 2:
                this.f13775b = 0;
                break;
            case 3:
                this.f13775b = 0;
                break;
            default:
                this.f13775b = 0;
                break;
        }
    }

    @Override // d2.f, d2.h
    public float a() {
        switch (this.f13774a) {
        }
        return this.f13775b;
    }

    @Override // d2.h
    public void b(z5.c cVar, int i11, int[] iArr, int[] iArr2) {
        switch (this.f13774a) {
            case 0:
                i.a(i11, iArr, iArr2, false);
                break;
            case 1:
                i.d(i11, iArr, iArr2, false);
                break;
            case 2:
                i.e(i11, iArr, iArr2, false);
                break;
            default:
                i.f(i11, iArr, iArr2, false);
                break;
        }
    }

    @Override // d2.f
    public void c(z5.c cVar, int i11, int[] iArr, z5.m mVar, int[] iArr2) {
        switch (this.f13774a) {
            case 0:
                if (mVar != z5.m.Ltr) {
                    i.a(i11, iArr, iArr2, true);
                } else {
                    i.a(i11, iArr, iArr2, false);
                }
                break;
            case 1:
                if (mVar != z5.m.Ltr) {
                    i.d(i11, iArr, iArr2, true);
                } else {
                    i.d(i11, iArr, iArr2, false);
                }
                break;
            case 2:
                if (mVar != z5.m.Ltr) {
                    i.e(i11, iArr, iArr2, true);
                } else {
                    i.e(i11, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != z5.m.Ltr) {
                    i.f(i11, iArr, iArr2, true);
                } else {
                    i.f(i11, iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f13774a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            case 3:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i11, boolean z11) {
        this.f13774a = i11;
    }
}
