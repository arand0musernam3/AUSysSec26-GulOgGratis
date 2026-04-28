package h7;

import android.content.ClipData;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f21538a;

    public g(f fVar) {
        this.f21538a = fVar;
    }

    public static g e(ContentInfo contentInfo) {
        return new g(new c(contentInfo));
    }

    public ClipData a() {
        return this.f21538a.a();
    }

    public int b() {
        return this.f21538a.d();
    }

    public int c() {
        return this.f21538a.getSource();
    }

    public ContentInfo d() {
        ContentInfo contentInfoE = this.f21538a.e();
        Objects.requireNonNull(contentInfoE);
        return contentInfoE;
    }

    public String toString() {
        return this.f21538a.toString();
    }
}
