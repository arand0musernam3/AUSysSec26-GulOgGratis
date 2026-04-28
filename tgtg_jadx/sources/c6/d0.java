package c6;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.node.Owner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends j {
    public final View B;
    public final v4.d C;
    public y3.d D;
    public Function1 E;
    public Function1 F;
    public Function1 G;

    public d0(Context context, Function1 function1, m3.x xVar, y3.e eVar, int i11, Owner owner) {
        View view = (View) function1.invoke(context);
        v4.d dVar = new v4.d();
        super(context, xVar, i11, dVar, view, owner);
        this.B = view;
        this.C = dVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i11);
        Object objC = eVar != null ? eVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (eVar != null) {
            setSavableRegistryEntry(eVar.d(strValueOf, new i(this, 2)));
        }
        b bVar = r.f7755a;
        this.E = bVar;
        this.F = bVar;
        this.G = bVar;
    }

    public static final void m(d0 d0Var) {
        d0Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(y3.d dVar) {
        y3.d dVar2 = this.D;
        if (dVar2 != null) {
            ((t5.a) dVar2).L();
        }
        this.D = dVar;
    }

    @NotNull
    public final v4.d getDispatcher() {
        return this.C;
    }

    @NotNull
    public final Function1<View, Unit> getReleaseBlock() {
        return this.G;
    }

    @NotNull
    public final Function1<View, Unit> getResetBlock() {
        return this.F;
    }

    @Nullable
    public /* bridge */ /* synthetic */ c5.a getSubCompositionView() {
        return null;
    }

    @NotNull
    public final Function1<View, Unit> getUpdateBlock() {
        return this.E;
    }

    public final void setReleaseBlock(@NotNull Function1<View, Unit> function1) {
        this.G = function1;
        setRelease(new i(this, 3));
    }

    public final void setResetBlock(@NotNull Function1<View, Unit> function1) {
        this.F = function1;
        setReset(new i(this, 4));
    }

    public final void setUpdateBlock(@NotNull Function1<View, Unit> function1) {
        this.E = function1;
        setUpdate(new i(this, 5));
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }
}
