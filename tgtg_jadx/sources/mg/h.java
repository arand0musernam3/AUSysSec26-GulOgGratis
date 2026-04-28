package mg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.util.Consumer;
import bg.t;
import com.app.tgtg.customview.npsratingview.NpsRatingView;
import com.app.tgtg.model.remote.Country;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import uk.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29957c;

    public /* synthetic */ h(Object obj, int i11, int i12) {
        this.f29955a = i12;
        this.f29957c = obj;
        this.f29956b = i11;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i11 = this.f29955a;
        int i12 = this.f29956b;
        Object obj2 = this.f29957c;
        switch (i11) {
            case 0:
                NpsRatingView npsRatingView = (NpsRatingView) obj2;
                int i13 = NpsRatingView.f8945e;
                ((Animator) obj).getClass();
                npsRatingView.f8949d = false;
                i iVar = npsRatingView.f8947b;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parentRatingCallback");
                    iVar = null;
                }
                iVar.c(i12);
                ((LinearLayout) npsRatingView.f8946a.f34794b).setVisibility(8);
                break;
            case 1:
                mr.a aVar = (mr.a) obj2;
                ((View) obj).getClass();
                aVar.f30075c = ((Country) ((ArrayList) aVar.f30074b).get(i12)).getIso();
                aVar.notifyDataSetChanged();
                ((mr.b) aVar.f30076d).invoke((String) aVar.f30075c);
                break;
            default:
                q qVar = (q) obj2;
                ((Animator) obj).getClass();
                BottomSheetBehavior<?> sheetBehavior = qVar.getSheetBehavior();
                sheetBehavior.getClass();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(sheetBehavior.f12315f ? -1 : sheetBehavior.f12314e, i12);
                valueAnimatorOfInt.addUpdateListener(new t(qVar, 15));
                valueAnimatorOfInt.setDuration(200L).start();
                break;
        }
    }
}
