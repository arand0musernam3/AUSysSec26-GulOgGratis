package d1;

import android.os.Build;
import android.os.Bundle;
import ax.a0;
import ax.h0;
import ax.l0;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.google.android.material.bottomsheet.l;
import h2.b1;
import he.f0;
import he.z;
import i1.g;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.StringCompanionObject;
import m3.t1;
import org.json.JSONArray;
import org.json.JSONObject;
import tx.j;
import v80.i1;
import ve.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13688b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f13687a = i11;
        this.f13688b = obj;
    }

    private final void a() {
        Locale locale;
        String str = (String) this.f13688b;
        if (yx.a.f46339a.contains(ex.d.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            tx.c cVarA = j.a(a0.a());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((cVarA != null ? cVarA.a() : null) != null) {
                jSONArray.put(cVarA.a());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(nx.d.y() ? "1" : "0");
            try {
                locale = a0.a().getResources().getConfiguration().locale;
            } catch (Exception unused) {
                locale = null;
            }
            if (locale == null) {
                locale = Locale.getDefault();
                locale.getClass();
            }
            jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
            String string = jSONArray.toString();
            string.getClass();
            bundle.putString("device_session_id", ex.d.a());
            bundle.putString("extinfo", string);
            String str3 = h0.f4915j;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            boolean z11 = true;
            JSONObject jSONObject = new h0(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1)), bundle, l0.POST, null).c().f4942b;
            AtomicBoolean atomicBoolean = ex.d.f16517g;
            if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                z11 = false;
            }
            atomicBoolean.set(z11);
            if (atomicBoolean.get()) {
                ex.j jVar = ex.d.f16514d;
                if (jVar != null) {
                    jVar.c();
                }
            } else {
                ex.d.f16515e = null;
            }
            ex.d.f16518h = false;
        } catch (Throwable th2) {
            yx.a.a(ex.d.class, th2);
        }
    }

    private final void b() throws InterruptedException {
        ExecutorService executorService = (ExecutorService) this.f13688b;
        executorService.shutdownNow();
        executorService.awaitTermination(1L, TimeUnit.SECONDS);
    }

    private final void c() {
        ((g20.f) this.f13688b).a(true);
    }

    private final void d() {
        k.b((InputStream) this.f13688b);
    }

    private final void e() {
        k.b((ZipInputStream) this.f13688b);
    }

    private final void f() {
        z zVar = (z) this.f13688b;
        Semaphore semaphore = zVar.N;
        re.d dVar = zVar.f21995p;
        if (dVar == null) {
            return;
        }
        try {
            semaphore.acquire();
            dVar.r(zVar.f21982b.a());
        } catch (InterruptedException unused) {
        } finally {
            semaphore.release();
        }
    }

    private final void g() {
        ((f0) this.f13688b).c();
    }

    private final void h() {
        i1.d dVar = (i1.d) this.f13688b;
        if (dVar.f22764d != null) {
            dVar.f();
            g gVar = dVar.f22765e;
            gVar.getClass();
            Set<i1.a> setKeySet = dVar.f22768h;
            synchronized (gVar.f22772a) {
                if (setKeySet == null) {
                    try {
                        setKeySet = gVar.f22773b.keySet();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                for (i1.a aVar : setKeySet) {
                    if (gVar.f22773b.containsKey(aVar)) {
                        gVar.k((i1.b) gVar.f22773b.get(aVar));
                    }
                }
            }
        }
    }

    private final void i() {
        i1 i1Var = (i1) this.f13688b;
        if (i1Var != null) {
            i1Var.a(null);
        }
    }

    private final void j() throws Throwable {
        v80.f0.E(kotlin.coroutines.g.f26549a, new b1((j0.a) this.f13688b, null, 6));
    }

    private final void k() {
        l lVar = ((jg.a0) this.f13688b).l;
        if (lVar != null) {
            lVar.dismiss();
        }
    }

    private final void l() {
        XmlCheckoutAddressFragment xmlCheckoutAddressFragment = (XmlCheckoutAddressFragment) this.f13688b;
        xmlCheckoutAddressFragment.z().a();
        xmlCheckoutAddressFragment.x().c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
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
    private final void m() {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e.m():void");
    }

    private final void n() {
        v80.f0.j((t1) this.f13688b, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x053d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:504:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e.run():void");
    }
}
