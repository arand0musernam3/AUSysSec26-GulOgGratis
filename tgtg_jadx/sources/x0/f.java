package x0;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ProgressBar;
import androidx.fragment.app.g2;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.v;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.c6;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.internal.measurement.ye;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import d10.l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import jb.d0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DispatchException;
import o30.a1;
import o30.z0;
import org.bouncycastle.iana.AEADAlgorithm;
import oz.m;
import qb.o;
import qz.p0;
import qz.w;
import rb.k;
import u70.q;
import v80.b1;
import y00.a3;
import y00.j0;
import y00.l3;
import y00.l4;
import y00.m3;
import y00.n;
import y00.n1;
import y00.t2;
import y00.t4;
import y00.v1;
import y00.w0;
import y00.x1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43628c;

    public f(w wVar, p0 p0Var) {
        this.f43626a = 16;
        Objects.requireNonNull(wVar);
        this.f43628c = wVar;
        this.f43627b = p0Var;
    }

    private final void a() {
        o oVar;
        jb.f fVar = ((pb.a) this.f43628c).f34625a.f24929f;
        String str = (String) this.f43627b;
        synchronized (fVar.f24893k) {
            try {
                d0 d0VarC = fVar.c(str);
                oVar = d0VarC != null ? d0VarC.f24866a : null;
            } finally {
            }
        }
        if (oVar == null || Intrinsics.areEqual(ib.e.f23710j, oVar.f36837j)) {
            return;
        }
        synchronized (((pb.a) this.f43628c).f34627c) {
            ((pb.a) this.f43628c).f34630f.put(wd.a.v(oVar), oVar);
            pb.a aVar = (pb.a) this.f43628c;
            ((pb.a) this.f43628c).f34631g.put(wd.a.v(oVar), mb.i.a(aVar.f34632h, oVar, aVar.f34626b.f38957b, aVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, qz.j] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, qz.j] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void b() {
        w wVar = (w) this.f43628c;
        if (wVar.f37393b) {
            p0 p0Var = (p0) this.f43627b;
            pz.b bVar = p0Var.f37383b;
            boolean z11 = false;
            if (bVar.f35644b != 0 && bVar.f35645c != null) {
                ?? r32 = wVar.f37354a;
                Activity activityA = wVar.a();
                PendingIntent pendingIntent = bVar.f35645c;
                i0.h(pendingIntent);
                int i11 = p0Var.f37382a;
                int i12 = GoogleApiActivity.f11050b;
                Intent intent = new Intent(activityA, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i11);
                intent.putExtra("notify_manager", false);
                r32.startActivityForResult(intent, 1);
                return;
            }
            Activity activityA2 = wVar.a();
            int i13 = bVar.f35644b;
            GoogleApiAvailability googleApiAvailability = wVar.f37396e;
            if (googleApiAvailability.a(activityA2, null, i13) != null) {
                googleApiAvailability.e(wVar.a(), wVar.f37354a, bVar.f35644b, wVar);
                return;
            }
            if (bVar.f35644b != 18) {
                int i14 = p0Var.f37382a;
                wVar.f37394c.set(null);
                wVar.f37398g.j(bVar, i14);
                return;
            }
            Activity activityA3 = wVar.a();
            ProgressBar progressBar = new ProgressBar(activityA3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityA3);
            builder.setView(progressBar);
            builder.setMessage(com.google.android.gms.common.internal.w.b(activityA3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            GoogleApiAvailability.g(activityA3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", wVar);
            Context applicationContext = wVar.a().getApplicationContext();
            m mVar = new m(this, alertDialogCreate, z11, 10);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            com.google.firebase.messaging.d0 d0Var = new com.google.firebase.messaging.d0(mVar);
            androidx.core.app.e.j(applicationContext, d0Var, intentFilter);
            d0Var.f12793b = applicationContext;
            if (pz.e.c(applicationContext)) {
                return;
            }
            w wVar2 = (w) this.f43628c;
            wVar2.f37394c.set(null);
            w5 w5Var = wVar2.f37398g.f37348n;
            w5Var.sendMessage(w5Var.obtainMessage(3));
            if (alertDialogCreate.isShowing()) {
                alertDialogCreate.dismiss();
            }
            synchronized (d0Var) {
                try {
                    Context context = d0Var.f12793b;
                    if (context != null) {
                        context.unregisterReceiver(d0Var);
                    }
                    d0Var.f12793b = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final void c() {
        try {
            ((Runnable) this.f43628c).run();
            synchronized (((k) this.f43627b).f37849e) {
                ((k) this.f43627b).a();
            }
        } catch (Throwable th2) {
            synchronized (((k) this.f43627b).f37849e) {
                ((k) this.f43627b).a();
                throw th2;
            }
        }
    }

    private final void d() {
        l3 l3Var = (l3) this.f43628c;
        synchronized (l3Var) {
            try {
                l3Var.f44917a = false;
                m3 m3Var = l3Var.f44919c;
                if (!m3Var.G()) {
                    w0 w0Var = ((n1) m3Var.f21216b).f44987f;
                    n1.m(w0Var);
                    w0Var.f45266n.a("Connected to remote service");
                    j0 j0Var = (j0) this.f43627b;
                    m3Var.p();
                    i0.h(j0Var);
                    m3Var.f44962e = j0Var;
                    m3Var.C();
                    m3Var.E();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m3 m3Var2 = ((l3) this.f43628c).f44919c;
        ScheduledExecutorService scheduledExecutorService = m3Var2.f44965h;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            m3Var2.f44965h = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        ((java.lang.Runnable) r9.f43627b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        o30.a1.f31844f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r9.f43627b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        r9.f43627b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.f43628c     // Catch: java.lang.Throwable -> L5a
            o30.a1 r2 = (o30.a1) r2     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayDeque r2 = r2.f31846b     // Catch: java.lang.Throwable -> L5a
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.f43628c     // Catch: java.lang.Throwable -> L20
            o30.a1 r0 = (o30.a1) r0     // Catch: java.lang.Throwable -> L20
            o30.z0 r3 = r0.f31847c     // Catch: java.lang.Throwable -> L20
            o30.z0 r4 = o30.z0.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L48
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L48
        L20:
            r0 = move-exception
            goto L83
        L22:
            long r5 = r0.f31848d     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.f31848d = r5     // Catch: java.lang.Throwable -> L20
            r0.f31847c = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.f43628c     // Catch: java.lang.Throwable -> L20
            o30.a1 r3 = (o30.a1) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.f31846b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            r9.f43627b = r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L49
            java.lang.Object r0 = r9.f43628c     // Catch: java.lang.Throwable -> L20
            o30.a1 r0 = (o30.a1) r0     // Catch: java.lang.Throwable -> L20
            o30.z0 r3 = o30.z0.IDLE     // Catch: java.lang.Throwable -> L20
            r0.f31847c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L48
            goto L18
        L48:
            return
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5a
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r9.f43627b     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
        L57:
            r9.f43627b = r2     // Catch: java.lang.Throwable -> L5a
            goto L2
        L5a:
            r0 = move-exception
            goto L85
        L5c:
            r0 = move-exception
            goto L80
        L5e:
            r3 = move-exception
            o00.m1 r4 = o30.a1.f31844f     // Catch: java.lang.Throwable -> L5c
            java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L5c
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = r9.f43627b     // Catch: java.lang.Throwable -> L5c
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5c
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
            goto L57
        L80:
            r9.f43627b = r2     // Catch: java.lang.Throwable -> L5a
            throw r0     // Catch: java.lang.Throwable -> L5a
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L5a
        L85:
            if (r1 == 0) goto L8e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.f.e():void");
    }

    @Override // java.lang.Runnable
    public final void run() throws DispatchException {
        int i11 = 0;
        switch (this.f43626a) {
            case 0:
                c cVar = (c) this.f43628c;
                try {
                    cVar.onSuccess(g.a((Future) this.f43627b));
                    return;
                } catch (Error e5) {
                    e = e5;
                    cVar.onFailure(e);
                    return;
                } catch (RuntimeException e11) {
                    e = e11;
                    cVar.onFailure(e);
                    return;
                } catch (ExecutionException e12) {
                    Throwable cause = e12.getCause();
                    if (cause == null) {
                        cVar.onFailure(e12);
                        return;
                    } else {
                        cVar.onFailure(cause);
                        return;
                    }
                }
            case 1:
                ((androidx.core.app.c) this.f43627b).f2577a = this.f43628c;
                return;
            case 2:
                Object obj = this.f43628c;
                Object obj2 = this.f43627b;
                try {
                    Method method = androidx.core.app.d.f2586d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        androidx.core.app.d.f2587e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e13) {
                    if (e13.getClass() == RuntimeException.class && e13.getMessage() != null && e13.getMessage().startsWith("Unable to stop")) {
                        throw e13;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 3:
                g2 g2Var = (g2) this.f43628c;
                androidx.recyclerview.widget.h hVar = (androidx.recyclerview.widget.h) g2Var.f3202f;
                if (hVar.f3754g == g2Var.f3198b) {
                    List list = (List) g2Var.f3200d;
                    v vVar = (v) this.f43627b;
                    Runnable runnable = (Runnable) g2Var.f3201e;
                    List list2 = hVar.f3753f;
                    hVar.f3752e = list;
                    hVar.f3753f = Collections.unmodifiableList(list);
                    vVar.a(hVar.f3748a);
                    hVar.a(list2, runnable);
                    return;
                }
                return;
            case 4:
                r rVar = (r) this.f43628c;
                ArrayList<p> arrayList = (ArrayList) this.f43627b;
                for (p pVar : arrayList) {
                    ArrayList arrayList2 = rVar.f3898r;
                    long j9 = rVar.f3917f;
                    r2 r2Var = pVar.f3844a;
                    View view = r2Var == null ? null : r2Var.itemView;
                    r2 r2Var2 = pVar.f3845b;
                    View view2 = r2Var2 != null ? r2Var2.itemView : null;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j9);
                        arrayList2.add(pVar.f3844a);
                        duration.translationX(pVar.f3848e - pVar.f3846c);
                        duration.translationY(pVar.f3849f - pVar.f3847d);
                        duration.alpha(0.0f).setListener(new androidx.recyclerview.widget.o(rVar, pVar, duration, view, 0)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                        arrayList2.add(pVar.f3845b);
                        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j9).alpha(1.0f).setListener(new androidx.recyclerview.widget.o(rVar, pVar, viewPropertyAnimatorAnimate, view2, 1)).start();
                    }
                }
                arrayList.clear();
                rVar.f3894n.remove(arrayList);
                return;
            case 5:
                c9.a aVar = (c9.a) this.f43628c;
                Object obj3 = this.f43627b;
                boolean z11 = aVar.f7805c.get();
                c9.b bVar = aVar.f7808f;
                if (z11) {
                    bVar.dispatchOnCancelled(aVar, obj3);
                } else {
                    bVar.dispatchOnLoadComplete(aVar, obj3);
                }
                aVar.f7804b = c9.i.FINISHED;
                return;
            case 6:
                Task task = (Task) this.f43627b;
                boolean zL = task.l();
                d10.k kVar = (d10.k) this.f43628c;
                if (zL) {
                    kVar.f13713d.s();
                    return;
                }
                try {
                    kVar.f13713d.p(kVar.f13712c.g(task));
                    return;
                } catch (RuntimeExecutionException e14) {
                    if (e14.getCause() instanceof Exception) {
                        kVar.f13713d.r((Exception) e14.getCause());
                        return;
                    } else {
                        kVar.f13713d.r(e14);
                        return;
                    }
                } catch (Exception e15) {
                    kVar.f13713d.r(e15);
                    return;
                }
            case 7:
                l lVar = (l) this.f43628c;
                synchronized (lVar.f13716c) {
                    try {
                        OnCompleteListener onCompleteListener = (OnCompleteListener) lVar.f13717d;
                        if (onCompleteListener != null) {
                            onCompleteListener.onComplete((Task) this.f43627b);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 8:
                l lVar2 = (l) this.f43628c;
                synchronized (lVar2.f13716c) {
                    try {
                        d10.e eVar = (d10.e) lVar2.f13717d;
                        if (eVar != null) {
                            eVar.onSuccess(((Task) this.f43627b).getResult());
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 9:
                d10.o oVar = (d10.o) this.f43627b;
                try {
                    oVar.p(((Callable) this.f43628c).call());
                    return;
                } catch (Exception e16) {
                    oVar.r(e16);
                    return;
                } catch (Throwable th3) {
                    oVar.r(new RuntimeException(th3));
                    return;
                }
            case 10:
                t10.c cVar2 = (t10.c) this.f43627b;
                Typeface typeface = (Typeface) this.f43628c;
                w6.a aVar2 = (w6.a) cVar2.f39648a;
                if (aVar2 != null) {
                    aVar2.j(typeface);
                    return;
                }
                return;
            case 11:
                ListenableFuture listenableFuture = (ListenableFuture) this.f43627b;
                boolean zIsCancelled = listenableFuture.isCancelled();
                v80.l lVar3 = (v80.l) this.f43628c;
                if (zIsCancelled) {
                    lVar3.j(null);
                    return;
                }
                try {
                    u70.o oVar2 = q.f40850b;
                    while (true) {
                        try {
                            Object obj4 = listenableFuture.get();
                            if (i11 != 0) {
                                Thread.currentThread().interrupt();
                            }
                            lVar3.resumeWith(obj4);
                            return;
                        } catch (InterruptedException unused) {
                            i11 = 1;
                        } catch (Throwable th4) {
                            if (i11 != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th4;
                        }
                    }
                } catch (ExecutionException e17) {
                    u70.o oVar3 = q.f40850b;
                    Throwable cause2 = e17.getCause();
                    cause2.getClass();
                    lVar3.resumeWith(new u70.p(cause2));
                    return;
                }
                break;
            case 12:
                try {
                    e();
                    return;
                } catch (Error e18) {
                    synchronized (((a1) this.f43628c).f31846b) {
                        ((a1) this.f43628c).f31847c = z0.IDLE;
                        throw e18;
                    }
                }
            case 13:
                oz.l lVar4 = (oz.l) this.f43627b;
                IBinder iBinder = (IBinder) this.f43628c;
                synchronized (lVar4) {
                    if (iBinder == null) {
                        lVar4.a("Null service connection");
                    } else {
                        try {
                            lVar4.f33831c = new m(iBinder);
                            lVar4.f33829a = 2;
                            ((ScheduledExecutorService) lVar4.f33834f.f33846c).execute(new oz.j(lVar4, i11));
                        } catch (RemoteException e19) {
                            lVar4.a(e19.getMessage());
                        }
                    }
                }
                return;
            case 14:
                a();
                return;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                qz.m mVar = (qz.m) this.f43627b;
                qz.l lVar5 = (qz.l) this.f43628c;
                qz.k kVar2 = mVar.f37368b;
                if (kVar2 == null) {
                    return;
                }
                lVar5.g(kVar2.f37363a);
                return;
            case 16:
                b();
                return;
            case 17:
                c();
                return;
            case 18:
                ((v80.l) this.f43628c).D((b1) this.f43627b, Unit.f26487a);
                return;
            case 19:
                x1 x1Var = (x1) this.f43627b;
                x1Var.a();
                if (ky.p.v()) {
                    x1Var.d().y(this);
                    return;
                }
                n nVar = (n) this.f43628c;
                boolean z12 = nVar.f44981c != 0;
                nVar.f44981c = 0L;
                if (z12) {
                    nVar.a();
                    return;
                }
                return;
            case 20:
                m3 m3VarP = ((AppMeasurementDynamiteService) this.f43628c).f12155g.p();
                c6 c6Var = (c6) this.f43627b;
                m3VarP.p();
                m3VarP.q();
                m3VarP.D(new ye(12, m3VarP, m3VarP.F(false), c6Var, false));
                return;
            case 21:
                v1 v1Var = (v1) this.f43628c;
                v1Var.f45249g.W();
                y00.e eVar2 = (y00.e) this.f43627b;
                Object objD = eVar2.f44691c.d();
                l4 l4Var = v1Var.f45249g;
                if (objD == null) {
                    l4Var.getClass();
                    String str = eVar2.f44689a;
                    i0.h(str);
                    t4 t4VarQ = l4Var.Q(str);
                    if (t4VarQ != null) {
                        l4Var.b0(eVar2, t4VarQ);
                        return;
                    }
                    return;
                }
                l4Var.getClass();
                String str2 = eVar2.f44689a;
                i0.h(str2);
                t4 t4VarQ2 = l4Var.Q(str2);
                if (t4VarQ2 != null) {
                    l4Var.a0(eVar2, t4VarQ2);
                    return;
                }
                return;
            case 22:
                ((t2) this.f43628c).G((Boolean) this.f43627b, true);
                return;
            case 23:
                t2 t2Var = ((AppMeasurementDynamiteService) this.f43628c).f12155g.f44993m;
                n1.l(t2Var);
                ub.a aVar3 = (ub.a) this.f43627b;
                t2Var.p();
                t2Var.q();
                ub.a aVar4 = t2Var.f45150e;
                if (aVar3 != aVar4) {
                    i0.j("EventInterceptor already set.", aVar4 == null);
                }
                t2Var.f45150e = aVar3;
                return;
            case 24:
                m3 m3Var = (m3) this.f43628c;
                j0 j0Var = m3Var.f44962e;
                n1 n1Var = (n1) m3Var.f21216b;
                if (j0Var == null) {
                    w0 w0Var = n1Var.f44987f;
                    n1.m(w0Var);
                    w0Var.f45260g.a("Failed to send current screen to service");
                    return;
                }
                try {
                    a3 a3Var = (a3) this.f43627b;
                    if (a3Var == null) {
                        j0Var.l(0L, null, null, n1Var.f44982a.getPackageName());
                    } else {
                        j0Var.l(a3Var.f44581c, a3Var.f44579a, a3Var.f44580b, n1Var.f44982a.getPackageName());
                    }
                    m3Var.C();
                    return;
                } catch (RemoteException e21) {
                    w0 w0Var2 = ((n1) m3Var.f21216b).f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45260g.b(e21, "Failed to send current screen to the service");
                    return;
                }
            case 25:
                ((l3) this.f43628c).f44919c.A((ComponentName) this.f43627b);
                return;
            case 26:
                d();
                return;
            default:
                l4 l4Var2 = (l4) this.f43627b;
                l4Var2.W();
                Runnable runnable2 = (Runnable) this.f43628c;
                l4Var2.d().p();
                if (l4Var2.f44934p == null) {
                    l4Var2.f44934p = new ArrayList();
                }
                l4Var2.f44934p.add(runnable2);
                l4Var2.q();
                return;
        }
    }

    public String toString() {
        switch (this.f43626a) {
            case 0:
                return f.class.getSimpleName() + MessageLogView.COMMA_SEPARATOR + ((c) this.f43628c);
            case 12:
                Runnable runnable = (Runnable) this.f43627b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + ((a1) this.f43628c).f31847c + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, boolean z11, int i11) {
        this.f43626a = i11;
        this.f43628c = obj;
        this.f43627b = obj2;
    }

    public /* synthetic */ f(int i11, Object obj, Object obj2) {
        this.f43626a = i11;
        this.f43627b = obj;
        this.f43628c = obj2;
    }

    public f(e eVar, l4 l4Var, Runnable runnable) {
        this.f43626a = 27;
        this.f43627b = l4Var;
        this.f43628c = runnable;
    }

    public f(m3 m3Var, a3 a3Var) {
        this.f43626a = 24;
        this.f43627b = a3Var;
        Objects.requireNonNull(m3Var);
        this.f43628c = m3Var;
    }

    public f(a1 a1Var) {
        this.f43626a = 12;
        this.f43628c = a1Var;
    }

    public f(ListenableFuture listenableFuture, v80.l lVar) {
        this.f43626a = 11;
        listenableFuture.getClass();
        this.f43627b = listenableFuture;
        this.f43628c = lVar;
    }
}
