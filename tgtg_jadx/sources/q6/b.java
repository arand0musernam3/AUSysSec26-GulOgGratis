package q6;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36078a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36079b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36080c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f36081d;

    public abstract void a(HashMap map);

    public abstract b b();

    public b c(b bVar) {
        this.f36078a = bVar.f36078a;
        this.f36079b = bVar.f36079b;
        this.f36080c = bVar.f36080c;
        this.f36081d = bVar.f36081d;
        return this;
    }

    public abstract void d(HashSet hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap map) {
    }
}
