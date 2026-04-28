package k00;

import org.bouncycastle.asn1.BERTags;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f25714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f25715b;

    public z0(int i11) {
        this.f25714a = (byte) (i11 & BERTags.FLAGS);
        this.f25715b = (byte) (i11 & 31);
    }
}
