package a1;

import a3.f1;
import android.media.MediaCodec;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.e;
import g1.d;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.s0;
import s0.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f187b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f186a = i11;
        this.f187b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i11 = this.f186a;
        int i12 = 0;
        Object obj3 = this.f187b;
        switch (i11) {
            case 0:
                l lVar = (l) obj2;
                ((b) obj3).getClass();
                Class cls = ((l) obj).f38374a.f38474j;
                int i13 = cls == MediaCodec.class ? 2 : (cls == s0.class || cls == d.class) ? 0 : 1;
                Class cls2 = lVar.f38374a.f38474j;
                if (cls2 == MediaCodec.class) {
                    i12 = 2;
                } else if (cls2 != s0.class && cls2 != d.class) {
                    i12 = 1;
                }
                return i13 - i12;
            case 1:
                return ((Number) ((f1) obj3).invoke(obj, obj2)).intValue();
            case 2:
                e eVar = (e) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int i14 = e.f12375k;
                int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(eVar.indexOfChild(materialButton), eVar.indexOfChild(materialButton2));
            case 3:
                return ((Number) ((Function2) obj3).invoke(obj, obj2)).intValue();
            default:
                for (Function1 function1 : (Function1[]) obj3) {
                    int iA = w70.a.a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (iA != 0) {
                        return iA;
                    }
                }
                return 0;
        }
    }
}
