package e20;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15690a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o.n f15691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f15693d;

    public p(x xVar) {
        this.f15693d = xVar;
        a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a() {
        if (this.f15692c) {
            return;
        }
        this.f15692c = true;
        ArrayList arrayList = this.f15690a;
        arrayList.clear();
        arrayList.add(new q());
        x xVar = this.f15693d;
        int size = xVar.f15701c.l().size();
        boolean z11 = false;
        int i11 = -1;
        int i12 = 0;
        boolean z12 = false;
        int size2 = 0;
        while (i12 < size) {
            o.n nVar = (o.n) xVar.f15701c.l().get(i12);
            if (nVar.isChecked()) {
                b(nVar);
            }
            if (nVar.isCheckable()) {
                nVar.f(z11);
            }
            if (nVar.hasSubMenu()) {
                o.d0 d0Var = nVar.f31583o;
                if (d0Var.hasVisibleItems()) {
                    if (i12 != 0) {
                        arrayList.add(new s(xVar.A, z11 ? 1 : 0));
                    }
                    arrayList.add(new t(nVar));
                    int size3 = d0Var.f31549f.size();
                    int i13 = z11 ? 1 : 0;
                    int i14 = i13;
                    while (i13 < size3) {
                        o.n nVar2 = (o.n) d0Var.getItem(i13);
                        if (nVar2.isVisible()) {
                            if (i14 == 0 && nVar2.getIcon() != null) {
                                i14 = 1;
                            }
                            if (nVar2.isCheckable()) {
                                nVar2.f(z11);
                            }
                            if (nVar2.isChecked()) {
                                b(nVar2);
                            }
                            arrayList.add(new t(nVar2));
                        }
                        i13++;
                        z11 = false;
                    }
                    if (i14 != 0) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((t) arrayList.get(size5)).f15697b = true;
                        }
                    }
                }
            } else {
                int i15 = nVar.f31571b;
                if (i15 != i11) {
                    size2 = arrayList.size();
                    z12 = nVar.getIcon() != null;
                    if (i12 != 0) {
                        size2++;
                        int i16 = xVar.A;
                        arrayList.add(new s(i16, i16));
                    }
                } else if (!z12 && nVar.getIcon() != null) {
                    int size6 = arrayList.size();
                    for (int i17 = size2; i17 < size6; i17++) {
                        ((t) arrayList.get(i17)).f15697b = true;
                    }
                    z12 = true;
                }
                t tVar = new t(nVar);
                tVar.f15697b = z12;
                arrayList.add(tVar);
                i11 = i15;
            }
            i12++;
            z11 = false;
        }
        this.f15692c = z11;
    }

    public final void b(o.n nVar) {
        if (this.f15691b == nVar || !nVar.isCheckable()) {
            return;
        }
        o.n nVar2 = this.f15691b;
        if (nVar2 != null) {
            nVar2.setChecked(false);
        }
        this.f15691b = nVar;
        nVar.setChecked(true);
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        return this.f15690a.size();
    }

    @Override // androidx.recyclerview.widget.l1
    public final long getItemId(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemViewType(int i11) {
        r rVar = (r) this.f15690a.get(i11);
        if (rVar instanceof s) {
            return 2;
        }
        if (rVar instanceof q) {
            return 3;
        }
        if (rVar instanceof t) {
            return ((t) rVar).f15696a.hasSubMenu() ? 1 : 0;
        }
        a40.d0.k("Unknown item type.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        w wVar = (w) r2Var;
        int itemViewType = getItemViewType(i11);
        ArrayList arrayList = this.f15690a;
        x xVar = this.f15693d;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                s sVar = (s) arrayList.get(i11);
                wVar.itemView.setPaddingRelative(xVar.f15716s, sVar.f15694a, xVar.f15717t, sVar.f15695b);
                return;
            }
            TextView textView = (TextView) wVar.itemView;
            textView.setText(((t) arrayList.get(i11)).f15696a.f31574e);
            textView.setTextAppearance(xVar.f15705g);
            textView.setPaddingRelative(xVar.f15718u, textView.getPaddingTop(), xVar.f15719v, textView.getPaddingBottom());
            ColorStateList colorStateList = xVar.f15706h;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            ViewCompat.b0(textView, new o(this, i11, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) wVar.itemView;
        navigationMenuItemView.setIconTintList(xVar.l);
        navigationMenuItemView.setTextAppearance(xVar.f15707i);
        ColorStateList colorStateList2 = xVar.f15709k;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = xVar.f15710m;
        navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
        RippleDrawable rippleDrawable = xVar.f15711n;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        t tVar = (t) arrayList.get(i11);
        navigationMenuItemView.setNeedsEmptyIcon(tVar.f15697b);
        int i12 = xVar.f15712o;
        int i13 = xVar.f15713p;
        navigationMenuItemView.setPadding(i12, i13, i12, i13);
        navigationMenuItemView.setIconPadding(xVar.f15714q);
        if (xVar.f15720w) {
            navigationMenuItemView.setIconSize(xVar.f15715r);
        }
        navigationMenuItemView.setMaxLines(xVar.f15722y);
        o.n nVar = tVar.f15696a;
        navigationMenuItemView.f12506y = xVar.f15708j;
        navigationMenuItemView.a(nVar);
        ViewCompat.b0(navigationMenuItemView, new o(this, i11, false));
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        x xVar = this.f15693d;
        if (i11 == 0) {
            LayoutInflater layoutInflater = xVar.f15704f;
            m mVar = xVar.C;
            v vVar = new v(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            vVar.itemView.setOnClickListener(mVar);
            return vVar;
        }
        if (i11 == 1) {
            return new n(xVar.f15704f.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i11 == 2) {
            return new n(xVar.f15704f.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i11 != 3) {
            return null;
        }
        return new n(xVar.f15700b);
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onViewRecycled(r2 r2Var) {
        w wVar = (w) r2Var;
        if (wVar instanceof v) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) wVar.itemView;
            FrameLayout frameLayout = navigationMenuItemView.A;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f12507z.setCompoundDrawables(null, null, null, null);
        }
    }
}
