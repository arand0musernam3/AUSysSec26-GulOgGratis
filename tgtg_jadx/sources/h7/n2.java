package h7;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends m2 {
    @Override // h7.l2, w.b
    public final boolean R() {
        return (this.f21587c.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // h7.l2, w.b
    public final void a0(boolean z11) {
        this.f21587c.setSystemBarsAppearance(z11 ? 16 : 0, 16);
    }

    @Override // h7.l2, w.b
    public final void b0(boolean z11) {
        this.f21587c.setSystemBarsAppearance(z11 ? 8 : 0, 8);
    }
}
