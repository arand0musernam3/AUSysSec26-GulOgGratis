package os;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import i80.n;
import kotlin.jvm.internal.FunctionReferenceImpl;
import pg.j3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f33743a = new d(3, j3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/app/tgtg/databinding/SpecialRewardRedeemerViewBinding;", 0);

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        return j3.a(layoutInflater, (ViewGroup) obj2, zBooleanValue);
    }
}
