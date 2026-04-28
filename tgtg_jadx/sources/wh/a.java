package wh;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends android.support.v4.media.session.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43421f = new a(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f43422g = new a(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f43423h = new a(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f43424i = new a(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43425e;

    public /* synthetic */ a(int i11) {
        this.f43425e = i11;
    }

    @Override // android.support.v4.media.session.a
    public final boolean t() {
        switch (this.f43425e) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return true;
            default:
                return false;
        }
    }

    @Override // android.support.v4.media.session.a
    public final int u() {
        switch (this.f43425e) {
            case 0:
                return 10000;
            case 1:
                return 13750;
            case 2:
                return 14250;
            default:
                return 14100;
        }
    }

    @Override // android.support.v4.media.session.a
    public final float v() {
        switch (this.f43425e) {
            case 0:
                return 0.7853982f;
            case 1:
                return 1.0471976f;
            case 2:
                return 1.5707964f;
            default:
                return 0.0f;
        }
    }

    @Override // android.support.v4.media.session.a
    public final float w() {
        switch (this.f43425e) {
            case 0:
                return 38.0f;
            case 1:
                return 34.0f;
            case 2:
                return 40.0f;
            default:
                return 30.0f;
        }
    }

    @Override // android.support.v4.media.session.a
    public final float x() {
        switch (this.f43425e) {
            case 0:
                return 24.0f;
            case 1:
                return 18.0f;
            case 2:
                return 20.0f;
            default:
                return 30.0f;
        }
    }
}
