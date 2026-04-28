package g8;

import android.content.Context;
import d8.c0;
import d8.y;
import ep.l;
import g3.j5;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k80.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.a f20087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f20088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f20089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20090e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile h8.c f20091f;

    public a(String str, e8.a aVar, Function1 function1, b0 b0Var) {
        this.f20086a = str;
        this.f20087b = aVar;
        this.f20088c = function1;
        this.f20089d = b0Var;
    }

    @Override // k80.c
    public final Object getValue(Object obj, KProperty kProperty) {
        h8.c cVar;
        Context context = (Context) obj;
        context.getClass();
        kProperty.getClass();
        h8.c cVar2 = this.f20091f;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.f20090e) {
            try {
                if (this.f20091f == null) {
                    Context applicationContext = context.getApplicationContext();
                    e8.a aVar = this.f20087b;
                    Function1 function1 = this.f20088c;
                    applicationContext.getClass();
                    List list = (List) function1.invoke(applicationContext);
                    b0 b0Var = this.f20089d;
                    l lVar = new l(13, applicationContext, this);
                    list.getClass();
                    this.f20091f = new h8.c(new h8.c(new y(new c0(h8.d.f21664a, new cp.i(13), new j5(2, lVar)), kotlin.collections.c0.c(new d8.c(list, (x70.c) null, 0)), aVar, b0Var)));
                }
                cVar = this.f20091f;
                cVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
