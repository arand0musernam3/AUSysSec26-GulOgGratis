package oz;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.RemoteViews;
import com.google.android.gms.internal.measurement.ag;
import com.google.android.gms.internal.measurement.eb;
import com.google.android.gms.internal.measurement.hf;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.zc;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.coroutines.CoroutineContext;
import o30.a0;
import o30.g0;
import o30.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements a0, xd.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static o f33843e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f33846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f33847d;

    public o(ye.b bVar) {
        this.f33845b = bVar;
        ye.g gVar = bVar.f45852a;
        this.f33847d = bVar.f();
        SharedPreferences sharedPreferences = gVar.f45887b.getSharedPreferences("amplitude-android-" + gVar.f45890e, 0);
        sharedPreferences.getClass();
        this.f33846c = sharedPreferences;
        this.f33844a = sharedPreferences.getInt("storage_version", 0);
    }

    public static synchronized o d(Context context) {
        try {
            if (f33843e == null) {
                f33843e = new o(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new wz.a("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33843e;
    }

    @Override // xd.b
    public void a(fd.l lVar) {
        c(lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f6, code lost:
    
        if (r3.b(r1) != r2) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3 A[Catch: all -> 0x0035, PHI: r0 r13
      0x00e3: PHI (r0v12 oz.o) = (r0v9 oz.o), (r0v22 oz.o) binds: [B:22:0x0045, B:60:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r13v14 ye.g) = (r13v8 ye.g), (r13v16 ye.g) binds: [B:22:0x0045, B:60:0x00e0] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:65:0x00f9, B:62:0x00e3, B:59:0x00cc), top: B:70:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ye.b] */
    /* JADX WARN: Type inference failed for: r0v11, types: [oz.o] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(z70.c r13) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.o.b(z70.c):java.lang.Object");
    }

    public void c(fd.l lVar) {
        RemoteViews remoteViews = (RemoteViews) this.f33847d;
        remoteViews.setImageViewBitmap(this.f33844a, lVar != null ? fd.o.j(lVar) : null);
        AppWidgetManager.getInstance((Context) this.f33845b).updateAppWidget((ComponentName) this.f33846c, remoteViews);
    }

    @Override // o30.a0
    public ListenableFuture call() {
        zc zcVar = (zc) this.f33845b;
        n0 n0Var = (n0) this.f33846c;
        int i11 = this.f33844a;
        ArrayList arrayList = (ArrayList) this.f33847d;
        ListenableFuture listenableFutureD = o0.d(n0Var);
        for (int i12 = 0; i12 < i11; i12++) {
            if (((Boolean) o0.b((Future) arrayList.get(i12))).booleanValue()) {
                if (((List) zcVar.f12086b).get(i12) != null) {
                    org.bouncycastle.jce.provider.a.c();
                    return null;
                }
                eb ebVar = new eb(1);
                int i13 = ag.f11261a;
                listenableFutureD = o0.f(listenableFutureD, new zc(3, hf.a(), ebVar), g0.INSTANCE);
            }
        }
        return listenableFutureD;
    }

    public synchronized d10.o e(n nVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(nVar.toString()));
            }
            if (!((l) this.f33847d).d(nVar)) {
                l lVar = new l(this);
                this.f33847d = lVar;
                lVar.d(nVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return nVar.f33839b.f13697a;
    }

    @Override // xd.b
    public void i(fd.l lVar) {
        lVar.getClass();
        c(lVar);
    }

    @Override // xd.b
    public void j(fd.l lVar) {
        c(lVar);
    }

    public o(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f33847d = new l(this);
        this.f33844a = 1;
        this.f33846c = scheduledExecutorService;
        this.f33845b = context.getApplicationContext();
    }

    public o(Context context, ComponentName componentName, RemoteViews remoteViews, int i11) {
        context.getClass();
        this.f33845b = context;
        this.f33846c = componentName;
        this.f33847d = remoteViews;
        this.f33844a = i11;
    }

    public /* synthetic */ o(zc zcVar, n0 n0Var, int i11, ArrayList arrayList) {
        this.f33845b = zcVar;
        this.f33846c = n0Var;
        this.f33844a = i11;
        this.f33847d = arrayList;
    }

    public o(int i11, CoroutineContext coroutineContext, x80.a aVar, y80.i iVar) {
        this.f33845b = iVar;
        this.f33844a = i11;
        this.f33846c = aVar;
        this.f33847d = coroutineContext;
    }
}
