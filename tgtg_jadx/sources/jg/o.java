package jg;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import com.braze.h2;
import java.util.ArrayList;
import pg.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c40.q f25210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25211c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25212d;

    public o(ArrayList arrayList, c40.q qVar) {
        this.f25209a = arrayList;
        this.f25210b = qVar;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        return this.f25209a.size();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemViewType(int i11) {
        int i12 = n.$EnumSwitchMapping$0[((p) this.f25209a.get(i11)).f25215c.ordinal()];
        if (i12 == 1) {
            return this.f25211c;
        }
        if (i12 == 2) {
            return 0;
        }
        e40.a.f();
        return 0;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        k kVar = (k) r2Var;
        kVar.getClass();
        kVar.a((p) this.f25209a.get(i11), this.f25212d);
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        viewGroup.getClass();
        if (i11 == 0) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            int i12 = n1.f35010t;
            DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
            n1 n1Var = (n1) a8.k.Z(layoutInflaterFrom, R.layout.list_item_mnu_address_province_header, null, false, null);
            n1Var.getClass();
            return new l(n1Var);
        }
        if (i11 != this.f25211c) {
            h2.b("viewType not set");
            return null;
        }
        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(viewGroup.getContext());
        int i13 = pg.l1.f34971w;
        DataBinderMapperImpl dataBinderMapperImpl2 = a8.c.f965a;
        pg.l1 l1Var = (pg.l1) a8.k.Z(layoutInflaterFrom2, R.layout.list_item_mnu_address_province, null, false, null);
        l1Var.getClass();
        return new m(l1Var, this.f25210b);
    }
}
