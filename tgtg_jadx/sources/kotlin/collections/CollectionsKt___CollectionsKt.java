package kotlin.collections;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "", "firstOrNull", "(Ljava/util/List;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3843:1\n296#1,2:3844\n531#1,7:3846\n546#1,6:3853\n873#1,2:3860\n800#1:3862\n1924#1,2:3863\n801#1,2:3865\n1926#1:3867\n803#1:3868\n1924#1,3:3869\n822#1,2:3872\n862#1,2:3874\n1282#1,4:3880\n1249#1,4:3884\n1266#1,4:3888\n1315#1,4:3892\n1480#1,5:3896\n1496#1,5:3901\n1538#1,3:3906\n1541#1,3:3916\n1557#1,3:3919\n1560#1,3:3929\n1661#1,3:3946\n1629#1,4:3949\n1617#1:3953\n1924#1,2:3954\n1926#1:3957\n1618#1:3958\n1924#1,3:3959\n1651#1:3962\n1915#1:3963\n1916#1:3965\n1652#1:3966\n1915#1,2:3967\n1924#1,3:3969\n3013#1,3:3972\n3016#1,6:3976\n3038#1,3:3982\n3041#1,7:3986\n873#1,2:3993\n832#1:3995\n862#1,2:3996\n832#1:3998\n862#1,2:3999\n832#1:4001\n862#1,2:4002\n3562#1,8:4008\n3590#1,7:4016\n3621#1,10:4023\n1#2:3859\n1#2:3956\n1#2:3964\n1#2:3975\n1#2:3985\n37#3,2:3876\n37#3,2:3878\n410#4,7:3909\n410#4,7:3922\n410#4,7:3932\n410#4,7:3939\n32#5,2:4004\n32#5,2:4006\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n175#1:3844,2\n185#1:3846,7\n195#1:3853,6\n777#1:3860,2\n788#1:3862\n788#1:3863,2\n788#1:3865,2\n788#1:3867\n788#1:3868\n800#1:3869,3\n812#1:3872,2\n832#1:3874,2\n1206#1:3880,4\n1221#1:3884,4\n1235#1:3888,4\n1301#1:3892,4\n1391#1:3896,5\n1404#1:3901,5\n1512#1:3906,3\n1512#1:3916,3\n1525#1:3919,3\n1525#1:3929,3\n1586#1:3946,3\n1596#1:3949,4\n1606#1:3953\n1606#1:3954,2\n1606#1:3957\n1606#1:3958\n1617#1:3959,3\n1642#1:3962\n1642#1:3963\n1642#1:3965\n1642#1:3966\n1651#1:3967,2\n2813#1:3969,3\n3113#1:3972,3\n3113#1:3976,6\n3130#1:3982,3\n3130#1:3986,7\n3300#1:3993,2\n3308#1:3995\n3308#1:3996,2\n3318#1:3998\n3318#1:3999,2\n3328#1:4001\n3328#1:4002,2\n3551#1:4008,8\n3579#1:4016,7\n3608#1:4023,10\n1606#1:3956\n1642#1:3964\n3113#1:3975\n3130#1:3985\n1054#1:3876,2\n1101#1:3878,2\n1512#1:3909,7\n1525#1:3922,7\n1540#1:3932,7\n1559#1:3939,7\n3496#1:4004,2\n3538#1:4006,2\n*E\n"})
public class CollectionsKt___CollectionsKt extends k0 {
    public static final void C(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, Function1 function1) {
        iterable.getClass();
        appendable.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        appendable.append(charSequence2);
        int i12 = 0;
        for (Object obj : iterable) {
            i12++;
            if (i12 > 1) {
                appendable.append(charSequence);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            } else {
                kotlin.text.r.a(appendable, obj, function1);
            }
        }
        if (i11 >= 0 && i12 > i11) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static final void D(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static final List E(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        D(iterable, arrayList);
        return arrayList;
    }

    @Nullable
    public static <T> T firstOrNull(@NotNull List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
