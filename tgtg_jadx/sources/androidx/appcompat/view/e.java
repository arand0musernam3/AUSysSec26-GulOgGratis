package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.ActionMode;
import java.util.ArrayList;
import o.a0;
import o.s;
import q1.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f1853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1855c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f1856d = new k1(0);

    public e(Context context, ActionMode.Callback callback) {
        this.f1854b = context;
        this.f1853a = callback;
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final void a(ActionMode actionMode) {
        this.f1853a.onDestroyActionMode(e(actionMode));
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean b(ActionMode actionMode, Menu menu) {
        f fVarE = e(actionMode);
        k1 k1Var = this.f1856d;
        Menu a0Var = (Menu) k1Var.get(menu);
        if (a0Var == null) {
            a0Var = new a0(this.f1854b, (o.l) menu);
            k1Var.put(menu, a0Var);
        }
        return this.f1853a.onCreateActionMode(fVarE, a0Var);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean c(ActionMode actionMode, Menu menu) {
        f fVarE = e(actionMode);
        k1 k1Var = this.f1856d;
        Menu a0Var = (Menu) k1Var.get(menu);
        if (a0Var == null) {
            a0Var = new a0(this.f1854b, (o.l) menu);
            k1Var.put(menu, a0Var);
        }
        return this.f1853a.onPrepareActionMode(fVarE, a0Var);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        return this.f1853a.onActionItemClicked(e(actionMode), new s(this.f1854b, (a7.a) menuItem));
    }

    public final f e(ActionMode actionMode) {
        ArrayList arrayList = this.f1855c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) arrayList.get(i11);
            if (fVar != null && fVar.f1858b == actionMode) {
                return fVar;
            }
        }
        f fVar2 = new f(this.f1854b, actionMode);
        arrayList.add(fVar2);
        return fVar2;
    }
}
