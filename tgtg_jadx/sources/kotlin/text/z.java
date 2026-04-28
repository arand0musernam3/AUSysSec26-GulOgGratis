package kotlin.text;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26624c;

    public /* synthetic */ z(Object obj, boolean z11, int i11) {
        this.f26622a = i11;
        this.f26624c = obj;
        this.f26623b = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        Pair pair;
        Pair pair2;
        boolean z11;
        Object next2;
        switch (this.f26622a) {
            case 0:
                char[] cArr = (char[]) this.f26624c;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iR = StringsKt__StringsKt.r(charSequence, cArr, iIntValue, this.f26623b);
                if (iR < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iR), 1);
            default:
                List list = (List) this.f26624c;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence2.getClass();
                boolean z12 = this.f26623b;
                if (z12 || list.size() != 1) {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    IntRange intRange = new IntRange(iIntValue2, charSequence2.length(), 1);
                    boolean z13 = charSequence2 instanceof String;
                    int i11 = intRange.f26555c;
                    int i12 = intRange.f26554b;
                    if (z13) {
                        if ((i11 > 0 && iIntValue2 <= i12) || (i11 < 0 && i12 <= iIntValue2)) {
                            int i13 = iIntValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str = (String) next2;
                                        z11 = z12;
                                        if (!y.l(0, i13, str.length(), str, (String) charSequence2, z11)) {
                                            z12 = z11;
                                        }
                                    } else {
                                        z11 = z12;
                                        next2 = null;
                                    }
                                }
                                String str2 = (String) next2;
                                if (str2 != null) {
                                    pair = new Pair(Integer.valueOf(i13), str2);
                                } else if (i13 != i12) {
                                    i13 += i11;
                                    z12 = z11;
                                }
                            }
                            pair2 = pair;
                        }
                    } else {
                        if ((i11 > 0 && iIntValue2 <= i12) || (i11 < 0 && i12 <= iIntValue2)) {
                            int i14 = iIntValue2;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        String str3 = (String) next;
                                        if (StringsKt__StringsKt.s(str3, 0, charSequence2, i14, str3.length(), z12)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                String str4 = (String) next;
                                if (str4 != null) {
                                    pair = new Pair(Integer.valueOf(i14), str4);
                                } else if (i14 != i12) {
                                    i14 += i11;
                                }
                            }
                        }
                    }
                } else {
                    String str5 = (String) CollectionsKt.g0(list);
                    int iG = StringsKt.G(charSequence2, str5, iIntValue2, false, 4);
                    pair2 = iG < 0 ? null : new Pair(Integer.valueOf(iG), str5);
                }
                if (pair2 != null) {
                    return new Pair(pair2.f26485a, Integer.valueOf(((String) pair2.f26486b).length()));
                }
                return null;
        }
    }
}
