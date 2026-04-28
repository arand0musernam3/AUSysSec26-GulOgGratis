package ja;

import android.content.Context;
import androidx.constraintlayout.widget.z;
import u70.l;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements ia.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f24785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f24788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24789g;

    public h(Context context, String str, z zVar, boolean z11, boolean z12) {
        context.getClass();
        zVar.getClass();
        this.f24783a = context;
        this.f24784b = str;
        this.f24785c = zVar;
        this.f24786d = z11;
        this.f24787e = z12;
        this.f24788f = l.b(new hi.d(this, 23));
    }

    @Override // ia.b
    public final b N() {
        return ((g) this.f24788f.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f24788f;
        if (tVar.a()) {
            ((g) tVar.getValue()).close();
        }
    }

    @Override // ia.b
    public final String getDatabaseName() {
        return this.f24784b;
    }

    @Override // ia.b
    public final void setWriteAheadLoggingEnabled(boolean z11) {
        t tVar = this.f24788f;
        if (tVar.a()) {
            ((g) tVar.getValue()).setWriteAheadLoggingEnabled(z11);
        }
        this.f24789g = z11;
    }
}
