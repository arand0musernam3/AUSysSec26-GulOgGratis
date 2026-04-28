package w2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n0 f42947f = new n0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f42948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5.u0 f42949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42952e;

    public j1(s1 s1Var, m5.u0 u0Var, boolean z11, boolean z12, boolean z13) {
        this.f42948a = s1Var;
        this.f42949b = u0Var;
        this.f42950c = z11;
        this.f42951d = z12;
        this.f42952e = z13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb2.append(this.f42948a);
        sb2.append(", textStyle=");
        sb2.append(this.f42949b);
        sb2.append(", singleLine=");
        sb2.append(this.f42950c);
        sb2.append(", softWrap=");
        sb2.append(this.f42951d);
        sb2.append(", isKeyboardTypePhone=");
        return r8.k.q(sb2, this.f42952e, ')');
    }
}
