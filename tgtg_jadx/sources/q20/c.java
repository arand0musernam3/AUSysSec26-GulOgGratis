package q20;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import ky.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i11 = message.what;
        if (i11 == 0) {
            g gVar = (g) message.obj;
            f fVar = gVar.f35938i;
            if (fVar.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
                if (layoutParams instanceof s6.e) {
                    s6.e eVar = (s6.e) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    jb.b bVar = baseTransientBottomBar$Behavior.f12604i;
                    bVar.getClass();
                    bVar.f24851a = gVar.f35948t;
                    baseTransientBottomBar$Behavior.f12276b = new o(gVar, 14);
                    eVar.b(baseTransientBottomBar$Behavior);
                    eVar.f38845g = 80;
                }
                ViewGroup viewGroup = gVar.f35936g;
                fVar.f35923k = true;
                viewGroup.addView(fVar);
                fVar.f35923k = false;
                gVar.f();
                fVar.setVisibility(4);
            }
            if (fVar.isLaidOut()) {
                gVar.e();
                return true;
            }
            gVar.f35946r = true;
            return true;
        }
        if (i11 != 1) {
            return false;
        }
        g gVar2 = (g) message.obj;
        int i12 = message.arg1;
        f fVar2 = gVar2.f35938i;
        AccessibilityManager accessibilityManager = gVar2.f35947s;
        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || fVar2.getVisibility() != 0) {
            gVar2.c();
            return true;
        }
        if (fVar2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setInterpolator(gVar2.f35933d);
            valueAnimatorOfFloat.addUpdateListener(new b(gVar2, 0));
            valueAnimatorOfFloat.setDuration(gVar2.f35931b);
            valueAnimatorOfFloat.addListener(new a(gVar2, i12, 0));
            valueAnimatorOfFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        f fVar3 = gVar2.f35938i;
        int height = fVar3.getHeight();
        ViewGroup.LayoutParams layoutParams2 = fVar3.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(gVar2.f35934e);
        valueAnimator.setDuration(gVar2.f35932c);
        valueAnimator.addListener(new a(gVar2, i12, 2));
        valueAnimator.addUpdateListener(new b(gVar2, 3));
        valueAnimator.start();
        return true;
    }
}
