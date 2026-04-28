package y9;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f45738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f45739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45740c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f45743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f45744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public he.d f45745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45746i;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f45753q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f45754r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f45741d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f45742e = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f45747j = u.AUTOMATIC;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f45748k = -1;
    public final u6.f l = new u6.f(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f45749m = new LinkedHashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f45750n = new LinkedHashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f45751o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45752p = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f45755s = true;

    public t(Context context, Class cls, String str) {
        this.f45738a = Reflection.getOrCreateKotlinClass(cls);
        this.f45739b = context;
        this.f45740c = str;
    }

    public final void a(ba.a... aVarArr) {
        for (ba.a aVar : aVarArr) {
            Integer numValueOf = Integer.valueOf(aVar.f6074a);
            LinkedHashSet linkedHashSet = this.f45750n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(aVar.f6075b));
        }
        ba.a[] aVarArr2 = (ba.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        u6.f fVar = this.l;
        fVar.getClass();
        for (ba.a aVar2 : aVarArr2) {
            fVar.e(aVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f9, code lost:
    
        i4.a.f("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y9.v b() {
        /*
            Method dump skipped, instruction units count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.t.b():y9.v");
    }
}
