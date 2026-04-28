package ob;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.a f32413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f32414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f32416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f32417e;

    public e(Context context, sb.a aVar) {
        this.f32413a = aVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f32414b = applicationContext;
        this.f32415c = new Object();
        this.f32416d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f32415c) {
            Object obj2 = this.f32417e;
            if (obj2 == null || !Intrinsics.areEqual(obj2, obj)) {
                this.f32417e = obj;
                this.f32413a.f38959d.execute(new mr.h(CollectionsKt.r0(this.f32416d), this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
