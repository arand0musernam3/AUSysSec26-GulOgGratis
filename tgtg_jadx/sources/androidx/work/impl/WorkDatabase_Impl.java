package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import iu.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jb.d;
import jb.q;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import l8.g;
import qb.b;
import qb.e;
import qb.j;
import qb.w;
import qb.y;
import u70.l;
import u70.t;
import y9.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {
    public final t l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f4152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f4153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f4154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f4155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f4156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f4157r;

    public WorkDatabase_Impl() {
        final int i11 = 0;
        this.l = l.b(new Function0(this) { // from class: jb.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f24921b;

            {
                this.f24921b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new qb.w(this.f24921b);
                    case 1:
                        return new qb.b(this.f24921b);
                    case 2:
                        return new qb.y(this.f24921b);
                    case 3:
                        return new qb.g(this.f24921b);
                    case 4:
                        return new qb.j(this.f24921b);
                    case 5:
                        return new qb.l(this.f24921b);
                    default:
                        return new qb.d(this.f24921b);
                }
            }
        });
        final int i12 = 1;
        this.f4152m = l.b(new Function0(this) { // from class: jb.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f24921b;

            {
                this.f24921b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return new qb.w(this.f24921b);
                    case 1:
                        return new qb.b(this.f24921b);
                    case 2:
                        return new qb.y(this.f24921b);
                    case 3:
                        return new qb.g(this.f24921b);
                    case 4:
                        return new qb.j(this.f24921b);
                    case 5:
                        return new qb.l(this.f24921b);
                    default:
                        return new qb.d(this.f24921b);
                }
            }
        });
        final int i13 = 2;
        this.f4153n = l.b(new Function0(this) { // from class: jb.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f24921b;

            {
                this.f24921b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new qb.w(this.f24921b);
                    case 1:
                        return new qb.b(this.f24921b);
                    case 2:
                        return new qb.y(this.f24921b);
                    case 3:
                        return new qb.g(this.f24921b);
                    case 4:
                        return new qb.j(this.f24921b);
                    case 5:
                        return new qb.l(this.f24921b);
                    default:
                        return new qb.d(this.f24921b);
                }
            }
        });
        final int i14 = 3;
        this.f4154o = l.b(new Function0(this) { // from class: jb.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f24921b;

            {
                this.f24921b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return new qb.w(this.f24921b);
                    case 1:
                        return new qb.b(this.f24921b);
                    case 2:
                        return new qb.y(this.f24921b);
                    case 3:
                        return new qb.g(this.f24921b);
                    case 4:
                        return new qb.j(this.f24921b);
                    case 5:
                        return new qb.l(this.f24921b);
                    default:
                        return new qb.d(this.f24921b);
                }
            }
        });
        final int i15 = 4;
        this.f4155p = l.b(new Function0(this) { // from class: jb.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f24921b;

            {
                this.f24921b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return new qb.w(this.f24921b);
                    case 1:
                        return new qb.b(this.f24921b);
                    case 2:
                        return new qb.y(this.f24921b);
                    case 3:
                        return new qb.g(this.f24921b);
                    case 4:
                        return new qb.j(this.f24921b);
                    case 5:
                        return new qb.l(this.f24921b);
                    default:
                        return new qb.d(this.f24921b);
                }
            }
        });
        final int i16 = 5;
        this.f4156q = l.b(new Function0(this) { // from class: jb.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f24921b;

            {
                this.f24921b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return new qb.w(this.f24921b);
                    case 1:
                        return new qb.b(this.f24921b);
                    case 2:
                        return new qb.y(this.f24921b);
                    case 3:
                        return new qb.g(this.f24921b);
                    case 4:
                        return new qb.j(this.f24921b);
                    case 5:
                        return new qb.l(this.f24921b);
                    default:
                        return new qb.d(this.f24921b);
                }
            }
        });
        final int i17 = 6;
        this.f4157r = l.b(new Function0(this) { // from class: jb.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f24921b;

            {
                this.f24921b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return new qb.w(this.f24921b);
                    case 1:
                        return new qb.b(this.f24921b);
                    case 2:
                        return new qb.y(this.f24921b);
                    case 3:
                        return new qb.g(this.f24921b);
                    case 4:
                        return new qb.j(this.f24921b);
                    case 5:
                        return new qb.l(this.f24921b);
                    default:
                        return new qb.d(this.f24921b);
                }
            }
        });
        l.b(new a(this));
    }

    @Override // y9.v
    public final List c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(13, 14, 10));
        arrayList.add(new q(0));
        arrayList.add(new d(16, 17, 11));
        arrayList.add(new d(17, 18, 12));
        arrayList.add(new d(18, 19, 13));
        arrayList.add(new q(1));
        arrayList.add(new d(20, 21, 14));
        arrayList.add(new d(22, 23, 15));
        arrayList.add(new d(23, 24, 16));
        return arrayList;
    }

    @Override // y9.v
    public final k d() {
        return new k(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // y9.v
    public final g e() {
        return new ft.g(this);
    }

    @Override // y9.v
    public final Set j() {
        return new LinkedHashSet();
    }

    @Override // y9.v
    public final LinkedHashMap k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(w.class);
        n0 n0Var = n0.f26529a;
        linkedHashMap.put(orCreateKotlinClass, n0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(b.class), n0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(y.class), n0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(qb.g.class), n0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(j.class), n0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(qb.l.class), n0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(qb.d.class), n0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(e.class), n0Var);
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b s() {
        return (b) this.f4152m.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final qb.d t() {
        return (qb.d) this.f4157r.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final qb.g u() {
        return (qb.g) this.f4154o.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j v() {
        return (j) this.f4155p.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final qb.l w() {
        return (qb.l) this.f4156q.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final w x() {
        return (w) this.l.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final y y() {
        return (y) this.f4153n.getValue();
    }
}
