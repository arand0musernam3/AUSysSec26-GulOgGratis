package a50;

import a8.h;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.fragment.app.s1;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.main.MainActivity;
import com.google.android.gms.internal.measurement.te;
import com.google.android.gms.oss.licenses.v2.zzab;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.z;
import dz.f;
import dz.g;
import e6.j;
import e6.l;
import e6.n;
import h7.w;
import hq.o;
import ib.p;
import ib.q;
import j4.s;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m0.g1;
import m0.h1;
import nx.k;
import oz.m;
import pg.c2;
import s0.e1;
import s0.f1;
import s0.r0;
import u30.e;
import w.a0;
import wy.i;
import ym.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e, s1, d10.d, g1, w, OnCompleteListener, d10.b, ez.a, dz.e, x0.a, vz.a, j, e1, o9.j, k, t40.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f825c;

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f823a = i11;
        this.f824b = obj;
        this.f825c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f825c
            tx.z r0 = (tx.z) r0
            java.lang.Object r1 = r7.f824b
            java.lang.String r1 = (java.lang.String) r1
            java.util.Set r2 = yx.a.f46339a
            java.lang.Class<ex.d> r3 = ex.d.class
            boolean r4 = r2.contains(r3)
            if (r4 == 0) goto L13
            goto L6a
        L13:
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L1f
            boolean r0 = r0.f40591i     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            r0 = r4
            goto L20
        L1d:
            r0 = move-exception
            goto L67
        L1f:
            r0 = r5
        L20:
            ax.a0 r6 = ax.a0.f4849a     // Catch: java.lang.Throwable -> L1d
            ax.s0 r6 = ax.s0.f4998a     // Catch: java.lang.Throwable -> L1d
            java.lang.Class<ax.s0> r6 = ax.s0.class
            boolean r2 = r2.contains(r6)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L2d
            goto L3d
        L2d:
            ax.s0 r2 = ax.s0.f4998a     // Catch: java.lang.Throwable -> L39
            r2.e()     // Catch: java.lang.Throwable -> L39
            ax.r0 r2 = ax.s0.f5004g     // Catch: java.lang.Throwable -> L39
            boolean r5 = r2.a()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r2 = move-exception
            yx.a.a(r6, r2)     // Catch: java.lang.Throwable -> L1d
        L3d:
            if (r0 == 0) goto L6a
            if (r5 == 0) goto L6a
            ex.d r0 = ex.d.f16511a     // Catch: java.lang.Throwable -> L1d
            java.util.Set r2 = yx.a.f46339a     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r2.contains(r0)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L4c
            goto L6a
        L4c:
            boolean r2 = ex.d.f16518h     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L51
            goto L6a
        L51:
            ex.d.f16518h = r4     // Catch: java.lang.Throwable -> L62
            java.util.concurrent.Executor r2 = ax.a0.c()     // Catch: java.lang.Throwable -> L62
            d1.e r4 = new d1.e     // Catch: java.lang.Throwable -> L62
            r5 = 8
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L62
            r2.execute(r4)     // Catch: java.lang.Throwable -> L62
            goto L6a
        L62:
            r1 = move-exception
            yx.a.a(r0, r1)     // Catch: java.lang.Throwable -> L1d
            goto L6a
        L67:
            yx.a.a(r3, r0)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a50.d.a():void");
    }

    @Override // vz.a
    public void accept(Object obj, Object obj2) {
        o oVar = (o) this.f824b;
        lq.j jVar = (lq.j) this.f825c;
        mq.a aVar = (mq.a) obj;
        int i11 = o.f22390h;
        aVar.getClass();
        ((lq.j) obj2).getClass();
        vz.a aVar2 = oVar.f22391d;
        if (aVar2 != null) {
            aVar2.accept(aVar, jVar);
        }
    }

    @Override // dz.e, x0.a
    public Object apply(Object obj) {
        g gVar = (g) this.f824b;
        i iVar = (i) this.f825c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        dz.a aVar = gVar.f15258d;
        ArrayList arrayListP = gVar.p(sQLiteDatabase, iVar, aVar.f15241b);
        for (ty.d dVar : ty.d.values()) {
            if (dVar != iVar.f43573c) {
                int size = aVar.f15241b - arrayListP.size();
                if (size <= 0) {
                    break;
                }
                arrayListP.addAll(gVar.p(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i11 = 0; i11 < arrayListP.size(); i11++) {
            sb2.append(((dz.b) arrayListP.get(i11)).f15245a);
            if (i11 < arrayListP.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j9 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j9));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j9), hashSet);
                }
                hashSet.add(new f(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListP.listIterator();
        while (listIterator.hasNext()) {
            dz.b bVar = (dz.b) listIterator.next();
            long j11 = bVar.f15245a;
            if (map.containsKey(Long.valueOf(j11))) {
                te teVarC = bVar.f15247c.c();
                for (f fVar : (Set) map.get(Long.valueOf(j11))) {
                    teVarC.d(fVar.f15252a, fVar.f15253b);
                }
                listIterator.set(new dz.b(j11, bVar.f15246b, teVarC.e()));
            }
        }
        return arrayListP;
    }

    @Override // nx.k
    public void b(File file) {
        ox.e eVar = (ox.e) this.f824b;
        ox.b bVar = (ox.b) this.f825c;
        file.getClass();
        eVar.f33788g = bVar;
        eVar.f33787f = file;
        Runnable runnable = eVar.f33789h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // m0.g1
    public void c(m0.j jVar) {
        c1.e eVar = (c1.e) this.f824b;
        h1 h1Var = (h1) this.f825c;
        e1.g gVar = e1.g.DEFAULT;
        if (h1Var.f28516c.a() && jVar.f28533d) {
            gVar = e1.g.YUV;
        }
        c1.g gVar2 = eVar.f6852a;
        e1.j.d((AtomicBoolean) gVar2.f6867c, true);
        e1.j.c((Thread) gVar2.f6869e);
        if (((e1.g) gVar2.f6876m) != gVar) {
            gVar2.f6876m = gVar;
            gVar2.u(gVar2.f6865a);
        }
    }

    @Override // o9.j
    public o9.d calculateScene(o9.k kVar, List list) {
        zzab zzabVar = (zzab) this.f824b;
        o9.j jVar = (o9.j) this.f825c;
        o9.d dVarCalculateScene = zzabVar.calculateScene(kVar, list);
        return dVarCalculateScene == null ? jVar.calculateScene(kVar, list) : dVarCalculateScene;
    }

    @Override // s0.e1
    public void d(f1 f1Var) {
        switch (this.f823a) {
            case 21:
                ((e1) this.f825c).d((ld.k) this.f824b);
                break;
            default:
                ((e1) this.f825c).d((m) this.f824b);
                break;
        }
    }

    @Override // ez.a
    public Object e() {
        switch (this.f823a) {
            case 9:
                cz.j jVar = (cz.j) this.f824b;
                Iterable iterable = (Iterable) this.f825c;
                g gVar = (g) jVar.f13633c;
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in ".concat(g.u(iterable))).execute();
                    break;
                }
                break;
            default:
                cz.j jVar2 = (cz.j) this.f824b;
                Iterator it = ((HashMap) this.f825c).entrySet().iterator();
                while (it.hasNext()) {
                    ((g) jVar2.f13635e).r(((Integer) r2.getValue()).intValue(), zy.c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // t40.a
    public void f(t40.b bVar) {
        t40.a aVar = (t40.a) this.f824b;
        t40.a aVar2 = (t40.a) this.f825c;
        aVar.f(bVar);
        aVar2.f(bVar);
    }

    @Override // d10.b
    public Object g(Task task) {
        z zVar = (z) this.f825c;
        String str = (String) this.f824b;
        synchronized (zVar) {
            zVar.f12894b.remove(str);
        }
        return task;
    }

    @Override // androidx.fragment.app.s1
    public void h(Bundle bundle) {
        LoginActivity loginActivity = (LoginActivity) this.f824b;
        Function0 function0 = (Function0) this.f825c;
        f70.b bVar = LoginActivity.f9032j;
        loginActivity.getSupportFragmentManager().e();
        if (bundle.getBoolean("accepted", false)) {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    @Override // u30.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(zw.q2 r4) {
        /*
            r3 = this;
            int r0 = r3.f823a
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f824b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.f825c
            u30.b r1 = (u30.b) r1
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1a
            u30.e r0 = r1.f40675f     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = r0.i(r4)     // Catch: java.lang.Throwable -> L1a
            android.os.Trace.endSection()
            return r4
        L1a:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        L1f:
            java.lang.Object r0 = r3.f824b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.f825c
            org.bouncycastle.jce.provider.a r1 = (org.bouncycastle.jce.provider.a) r1
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r4 = r4.b(r2)
            android.content.Context r4 = (android.content.Context) r4
            int r1 = r1.f33331f
            switch(r1) {
                case 12: goto L93;
                case 13: goto L86;
                case 14: goto L4a;
                default: goto L34;
            }
        L34:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r4 = r1.getInstallerPackageName(r4)
            if (r4 == 0) goto L47
            java.lang.String r4 = com.google.firebase.FirebaseCommonRegistrar.a(r4)
            goto L9f
        L47:
            java.lang.String r4 = ""
            goto L9f
        L4a:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.television"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L59
            java.lang.String r4 = "tv"
            goto L9f
        L59:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.watch"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L68
            java.lang.String r4 = "watch"
            goto L9f
        L68:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.automotive"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L77
            java.lang.String r4 = "auto"
            goto L9f
        L77:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r1 = "android.hardware.type.embedded"
            boolean r4 = r4.hasSystemFeature(r1)
            if (r4 == 0) goto L47
            java.lang.String r4 = "embedded"
            goto L9f
        L86:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            if (r4 == 0) goto L47
            int r4 = r4.minSdkVersion
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L9f
        L93:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            if (r4 == 0) goto L47
            int r4 = r4.targetSdkVersion
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L9f:
            a50.a r1 = new a50.a
            r1.<init>(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a50.d.i(zw.q2):java.lang.Object");
    }

    @Override // e6.j
    public Object o(e6.i iVar) {
        switch (this.f823a) {
            case 19:
                Executor executor = (Executor) this.f824b;
                Function0 function0 = (Function0) this.f825c;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                iVar.a(new p(atomicBoolean, 1), ib.k.INSTANCE);
                executor.execute(new q(atomicBoolean, iVar, function0, 1));
                return Unit.f26487a;
            default:
                h1 h1Var = (h1) this.f824b;
                ((AtomicReference) this.f825c).set(iVar);
                return "SurfaceRequest-surface-recreation(" + h1Var.hashCode() + ")";
        }
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.f823a) {
            case 5:
                break;
            case 13:
                MainActivity mainActivity = (MainActivity) this.f824b;
                eo.f fVar = (eo.f) this.f825c;
                x6.d dVarX = s.x(view, windowInsetsCompat);
                int iE0 = mainActivity.e0();
                ViewGroup.LayoutParams layoutParams = fVar.r().getLayoutParams();
                layoutParams.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = dVarX.f43874b;
                int i11 = dVarX.f43876d;
                if (iE0 > 0) {
                    i11 += iE0;
                }
                marginLayoutParams.bottomMargin = i11;
                fVar.r().setLayoutParams(marginLayoutParams);
                break;
            case 17:
                MainActivity mainActivity2 = (MainActivity) this.f824b;
                hn.b bVar = (hn.b) this.f825c;
                x6.d dVarX2 = s.x(view, windowInsetsCompat);
                int iE02 = mainActivity2.e0();
                pg.a aVar = bVar.f22177g;
                pg.a aVar2 = null;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aVar = null;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.f34761c;
                pg.a aVar3 = bVar.f22177g;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aVar3 = null;
                }
                int paddingLeft = ((ConstraintLayout) aVar3.f34761c).getPaddingLeft();
                int i12 = dVarX2.f43874b;
                pg.a aVar4 = bVar.f22177g;
                if (aVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    aVar2 = aVar4;
                }
                int paddingRight = ((ConstraintLayout) aVar2.f34761c).getPaddingRight();
                int i13 = dVarX2.f43876d;
                if (iE02 > 0) {
                    i13 += iE02;
                }
                constraintLayout.setPadding(paddingLeft, i12, paddingRight, i13);
                break;
            default:
                MainActivity mainActivity3 = (MainActivity) this.f824b;
                u uVar = (u) this.f825c;
                x6.d dVarX3 = s.x(view, windowInsetsCompat);
                int iE03 = mainActivity3.e0();
                c2 c2Var = uVar.f46233g;
                if (c2Var != null) {
                    ConstraintLayout constraintLayout2 = c2Var.E;
                    RecyclerView recyclerView = c2Var.C;
                    int paddingLeft2 = constraintLayout2.getPaddingLeft();
                    int i14 = dVarX3.f43874b;
                    int paddingRight2 = constraintLayout2.getPaddingRight();
                    int i15 = dVarX3.f43876d;
                    if (iE03 > 0) {
                        i15 += iE03;
                    }
                    constraintLayout2.setPadding(paddingLeft2, i14, paddingRight2, i15);
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), d70.b.a(4) + recyclerView.getPaddingBottom());
                }
                break;
        }
        return windowInsetsCompat;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.f) this.f824b).b((Intent) this.f825c);
    }

    @Override // d10.d
    public void onFailure(Exception exc) {
        switch (this.f823a) {
            case 2:
                CredentialProviderBeginSignInController.invokePlayServices$lambda$6((CredentialProviderBeginSignInController) this.f824b, (CancellationSignal) this.f825c, exc);
                break;
            default:
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$8((CredentialProviderGetSignInIntentController) this.f824b, (CancellationSignal) this.f825c, exc);
                break;
        }
    }

    public /* synthetic */ d(Object obj, int i11, String str) {
        this.f823a = i11;
        this.f825c = obj;
        this.f824b = str;
    }

    @Override // dz.e, x0.a
    public ListenableFuture apply(Object obj) {
        g1.j jVar = (g1.j) this.f824b;
        ArrayList arrayList = (ArrayList) this.f825c;
        e.b bVar = (e.b) jVar.f18112d;
        Integer num = (Integer) ((r0) arrayList.get(0)).f38439b.i(r0.f38436g, 100);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        Integer num2 = (Integer) ((r0) arrayList.get(0)).f38439b.i(r0.f38435f, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        h hVar = ((g1.d) bVar.f15275b).f18085v;
        if (hVar != null) {
            c1.e eVar = (c1.e) hVar.f973b;
            e6.i iVar = new e6.i();
            iVar.f15778c = new n();
            l lVar = new l(iVar);
            iVar.f15777b = lVar;
            iVar.f15776a = a0.class;
            try {
                eVar.e(new a40.l(26, eVar, new c1.a(iIntValue, iIntValue2, iVar)), new al.u(iVar, 13));
                iVar.f15776a = "DefaultSurfaceProcessor#snapshot";
            } catch (Exception e5) {
                lVar.b(e5);
            }
            return x0.g.d(lVar);
        }
        return new x0.i(new Exception("Failed to take picture: pipeline is not ready."), 1);
    }
}
