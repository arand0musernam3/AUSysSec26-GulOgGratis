package f2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f17116b;

    public /* synthetic */ f(c0 c0Var, int i11) {
        this.f17115a = i11;
        this.f17116b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17115a) {
            case 0:
                return Integer.valueOf(this.f17116b.j().f17194n);
            case 1:
                List list = this.f17116b.j().f17192k;
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((t) ((m) it.next())).f17199a));
                }
                return arrayList;
            case 2:
                return Integer.valueOf(this.f17116b.i());
            case 3:
                return Boolean.valueOf(this.f17116b.f17096i.b());
            case 4:
                return Boolean.valueOf(this.f17116b.f17096i.b());
            case 5:
                c0 c0Var = this.f17116b;
                return Boolean.valueOf(c0Var.h() > 0 || (c0Var.h() == 0 && c0Var.i() > 0));
            case 6:
                return this.f17116b.j().f17192k;
            case 7:
                c0 c0Var2 = this.f17116b;
                m mVar = (m) CollectionsKt.X(c0Var2.j().f17192k);
                return Boolean.valueOf((mVar != null ? ((t) mVar).f17199a : 0) >= c0Var2.j().f17194n + (-3));
            case 8:
                c0 c0Var3 = this.f17116b;
                return new Pair(Integer.valueOf(c0Var3.h()), Integer.valueOf(c0Var3.i()));
            case 9:
                return this.f17116b.j().f17192k;
            default:
                return Integer.valueOf(this.f17116b.h());
        }
    }
}
