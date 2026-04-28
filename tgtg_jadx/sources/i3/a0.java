package i3;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements b2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f23097b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final at.w f23098c;

    public a0(b2.l lVar, long j9) {
        this.f23096a = j9;
        this.f23098c = new at.w(6, lVar.f5563a, this);
    }

    @Override // b2.k
    public final y80.i a() {
        return this.f23098c;
    }
}
