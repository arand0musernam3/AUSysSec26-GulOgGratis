package zw;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f48363c = new v(t.none, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f48364d = new v(t.xMidYMid, u.meet);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f48365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f48366b;

    public v(t tVar, u uVar) {
        this.f48365a = tVar;
        this.f48366b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f48365a == vVar.f48365a && this.f48366b == vVar.f48366b;
    }

    public final String toString() {
        return this.f48365a + " " + this.f48366b;
    }
}
