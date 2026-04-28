package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {
    private static final /* synthetic */ q2[] $VALUES;

    @NotNull
    public static final o2 Companion;
    public static final q2 GONE;
    public static final q2 INVISIBLE;
    public static final q2 REMOVED;
    public static final q2 VISIBLE;

    static {
        q2 q2Var = new q2("REMOVED", 0);
        REMOVED = q2Var;
        q2 q2Var2 = new q2("VISIBLE", 1);
        VISIBLE = q2Var2;
        q2 q2Var3 = new q2("GONE", 2);
        GONE = q2Var3;
        q2 q2Var4 = new q2("INVISIBLE", 3);
        INVISIBLE = q2Var4;
        $VALUES = new q2[]{q2Var, q2Var2, q2Var3, q2Var4};
        Companion = new o2();
    }

    public static q2 valueOf(String str) {
        return (q2) Enum.valueOf(q2.class, str);
    }

    public static q2[] values() {
        return (q2[]) $VALUES.clone();
    }

    public final void a(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int i11 = p2.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i11 == 2) {
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (i11 == 3) {
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i11 != 4) {
            return;
        }
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
