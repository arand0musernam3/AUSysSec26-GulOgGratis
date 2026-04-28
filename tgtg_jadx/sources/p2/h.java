package p2;

import android.view.textclassifier.TextClassification;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClassification f34140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34141c;

    public h(Object obj, TextClassification textClassification, int i11) {
        super(obj);
        this.f34140b = textClassification;
        this.f34141c = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb2.append(this.f34128a);
        sb2.append(", textClassification=");
        sb2.append(this.f34140b);
        sb2.append(", index=");
        return k.o(sb2, this.f34141c, ')');
    }
}
