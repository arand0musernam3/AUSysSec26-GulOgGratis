package h7;

import android.content.ClipData;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21523b;

    public c() {
        this.f21522a = 2;
        this.f21523b = m3.i.w(Boolean.FALSE);
    }

    @Override // h7.f
    public ClipData a() {
        return ((ContentInfo) this.f21523b).getClip();
    }

    @Override // h7.d
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f21523b).setLinkUri(uri);
    }

    @Override // h7.d
    public g build() {
        return new g(new c(((ContentInfo.Builder) this.f21523b).build()));
    }

    @Override // h7.d
    public void c(int i11) {
        ((ContentInfo.Builder) this.f21523b).setFlags(i11);
    }

    @Override // h7.f
    public int d() {
        return ((ContentInfo) this.f21523b).getFlags();
    }

    @Override // h7.f
    public ContentInfo e() {
        return (ContentInfo) this.f21523b;
    }

    public void f(c5.y yVar, j5.v vVar, CoroutineContext coroutineContext, Consumer consumer) {
        o3.e eVar = new o3.e(new i5.i[16], 0);
        wd.a.H(vVar.a(), 0, new al.e(1, eVar, o3.e.class, "add", "add(Ljava/lang/Object;)Z", 8, 2));
        Arrays.sort(eVar.f31830a, 0, eVar.f31832c, new a1.a(new Function1[]{i5.b.f23363c, i5.b.f23364d}, 4));
        int i11 = eVar.f31832c;
        i5.i iVar = (i5.i) (i11 == 0 ? null : eVar.f31830a[i11 - 1]);
        if (iVar == null) {
            return;
        }
        z5.k kVar = iVar.f23385c;
        i5.d dVar = new i5.d(iVar.f23383a, kVar, v80.f0.b(coroutineContext), this, yVar);
        b5.s1 s1Var = iVar.f23386d;
        h4.c cVarV = z4.c0.i(s1Var).v(s1Var, true);
        long jC = kVar.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(yVar, i4.g0.z(android.support.v4.media.session.a.H(cVarV)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), dVar);
        scrollCaptureTarget.setScrollBounds(i4.g0.z(kVar));
        consumer.accept(scrollCaptureTarget);
    }

    @Override // h7.f
    public int getSource() {
        return ((ContentInfo) this.f21523b).getSource();
    }

    @Override // h7.d
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f21523b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f21522a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f21523b) + "}";
            default:
                return super.toString();
        }
    }

    public c(ContentInfo contentInfo) {
        this.f21522a = 1;
        contentInfo.getClass();
        this.f21523b = contentInfo;
    }

    public c(ClipData clipData, int i11) {
        this.f21522a = 0;
        this.f21523b = f0.x.d(clipData, i11);
    }
}
