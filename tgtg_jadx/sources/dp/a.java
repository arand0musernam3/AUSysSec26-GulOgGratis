package dp;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import z4.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f6.s f15040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f15041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f15042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f6.s sVar, List list, LinkedHashMap linkedHashMap, int i11) {
        super(1);
        this.f15039a = i11;
        this.f15040b = sVar;
        this.f15041c = list;
        this.f15042d = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15039a) {
            case 0:
                List list = this.f15041c;
                LinkedHashMap linkedHashMap = this.f15042d;
                this.f15040b.e((l1) obj, list, linkedHashMap);
                break;
            case 1:
                List list2 = this.f15041c;
                LinkedHashMap linkedHashMap2 = this.f15042d;
                this.f15040b.e((l1) obj, list2, linkedHashMap2);
                break;
            case 2:
                List list3 = this.f15041c;
                LinkedHashMap linkedHashMap3 = this.f15042d;
                this.f15040b.e((l1) obj, list3, linkedHashMap3);
                break;
            case 3:
                List list4 = this.f15041c;
                LinkedHashMap linkedHashMap4 = this.f15042d;
                this.f15040b.e((l1) obj, list4, linkedHashMap4);
                break;
            default:
                List list5 = this.f15041c;
                LinkedHashMap linkedHashMap5 = this.f15042d;
                this.f15040b.e((l1) obj, list5, linkedHashMap5);
                break;
        }
        return Unit.f26487a;
    }
}
