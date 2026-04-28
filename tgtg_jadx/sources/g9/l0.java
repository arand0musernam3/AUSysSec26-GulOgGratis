package g9;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends p0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f20170s;

    public l0(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.f20170s = cls;
        } else {
            wy.o.g(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // g9.p0, g9.q0
    public final String b() {
        return this.f20170s.getName();
    }

    @Override // g9.p0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        str.getClass();
        Class cls = this.f20170s;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i11];
            if (kotlin.text.y.k(((Enum) obj).name(), str, true)) {
                break;
            }
            i11++;
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder sbS = e0.f.s("Enum value ", str, " not found for type ");
        sbS.append(cls.getName());
        sbS.append('.');
        throw new IllegalArgumentException(sbS.toString());
    }
}
