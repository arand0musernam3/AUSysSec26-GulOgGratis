package c50;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u70.t f7549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.t f7551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u70.t f7552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7553f;

    public g0(Context context, l1 l1Var) {
        context.getClass();
        l1Var.getClass();
        this.f7548a = context;
        final int i11 = 0;
        this.f7549b = u70.l.b(new Function0(this) { // from class: c50.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f7532b;

            {
                this.f7532b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ((h0) this.f7532b.f7552e.getValue()).f7569a;
                    default:
                        return i0.b(this.f7532b.f7548a);
                }
            }
        });
        this.f7550c = Process.myPid();
        this.f7551d = u70.l.b(new aa.e(l1Var, 20));
        final int i12 = 1;
        this.f7552e = u70.l.b(new Function0(this) { // from class: c50.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f7532b;

            {
                this.f7532b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ((h0) this.f7532b.f7552e.getValue()).f7569a;
                    default:
                        return i0.b(this.f7532b.f7548a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f7549b.getValue();
    }

    public final Map b(Map map) {
        u70.t tVar = this.f7551d;
        if (map == null) {
            return kotlin.collections.w0.b(new Pair(a(), new e0(Process.myPid(), (String) tVar.getValue())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new e0(Process.myPid(), (String) tVar.getValue()));
        return kotlin.collections.x0.k(linkedHashMap);
    }
}
