package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f3055b = new v(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3056a;

    public /* synthetic */ v(int i11) {
        this.f3056a = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final z0 a(Class cls) {
        switch (this.f3056a) {
            case 0:
                if (z.class.isAssignableFrom(cls)) {
                    try {
                        return (z0) z.d(cls.asSubclass(z.class)).c(y.BUILD_MESSAGE_INFO);
                    } catch (Exception e5) {
                        a40.d0.o("Unable to get message info for ".concat(cls.getName()), e5);
                    }
                } else {
                    i4.a.f("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean b(Class cls) {
        switch (this.f3056a) {
            case 0:
                return z.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
