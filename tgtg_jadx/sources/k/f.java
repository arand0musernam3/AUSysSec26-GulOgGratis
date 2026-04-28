package k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends y implements DialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f25563a;

    public f(ContextThemeWrapper contextThemeWrapper, int i11) {
        super(contextThemeWrapper, c(contextThemeWrapper, i11));
        this.f25563a = new e(getContext(), this, getWindow());
    }

    public static int c(Context context, int i11) {
        if (((i11 >>> 24) & 255) >= 1) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // k.y, androidx.activity.o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i11;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        e eVar = this.f25563a;
        eVar.f25534b.setContentView(eVar.f25557z);
        Context context = eVar.f25533a;
        Window window = eVar.f25535c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = eVar.f25539g;
        if (view == null) {
            view = null;
        }
        boolean z11 = view != null;
        if (!z11 || !e.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.f25540h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.f25538f != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = e.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = e.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = e.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        eVar.f25549r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f25549r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        eVar.f25553v = textView;
        if (textView != null) {
            String str = eVar.f25537e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                eVar.f25549r.removeView(eVar.f25553v);
                if (eVar.f25538f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) eVar.f25549r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(eVar.f25549r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(eVar.f25538f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        eVar.f25541i = button;
        e20.m mVar = eVar.F;
        button.setOnClickListener(mVar);
        boolean zIsEmpty = TextUtils.isEmpty(eVar.f25542j);
        Button button2 = eVar.f25541i;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i11 = 0;
        } else {
            button2.setText(eVar.f25542j);
            eVar.f25541i.setVisibility(0);
            i11 = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        eVar.l = button3;
        button3.setOnClickListener(mVar);
        boolean zIsEmpty2 = TextUtils.isEmpty(eVar.f25544m);
        Button button4 = eVar.l;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(eVar.f25544m);
            eVar.l.setVisibility(0);
            i11 |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        eVar.f25546o = button5;
        button5.setOnClickListener(mVar);
        boolean zIsEmpty3 = TextUtils.isEmpty(eVar.f25547p);
        Button button6 = eVar.f25546o;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(eVar.f25547p);
            eVar.f25546o.setVisibility(0);
            i11 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i11 == 1) {
                Button button7 = eVar.f25541i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i11 == 2) {
                Button button8 = eVar.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i11 == 4) {
                Button button9 = eVar.f25546o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i11 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (eVar.f25554w != null) {
            viewGroupB.addView(eVar.f25554w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            eVar.f25551t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(eVar.f25536d) || !eVar.D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                eVar.f25551t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                eVar.f25552u = textView2;
                textView2.setText(eVar.f25536d);
                Drawable drawable = eVar.f25550s;
                if (drawable != null) {
                    eVar.f25551t.setImageDrawable(drawable);
                } else {
                    eVar.f25552u.setPadding(eVar.f25551t.getPaddingLeft(), eVar.f25551t.getPaddingTop(), eVar.f25551t.getPaddingRight(), eVar.f25551t.getPaddingBottom());
                    eVar.f25551t.setVisibility(8);
                }
            }
        }
        boolean z12 = viewGroup.getVisibility() != 8;
        boolean z13 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z14 = viewGroupB3.getVisibility() != 8;
        if (!z14 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (z13 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f25549r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (eVar.f25537e == null && eVar.f25538f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f25538f;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.setHasDecor(z13, z14);
        }
        if (!z12) {
            View view2 = eVar.f25538f;
            if (view2 == null) {
                view2 = eVar.f25549r;
            }
            if (view2 != null) {
                int i12 = z14 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                ViewCompat.n0(view2, z13 | i12, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f25538f;
        if (alertController$RecycleListView2 == null || (listAdapter = eVar.f25555x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i13 = eVar.f25556y;
        if (i13 > -1) {
            alertController$RecycleListView2.setItemChecked(i13, true);
            alertController$RecycleListView2.setSelection(i13);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f25563a.f25549r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i11, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f25563a.f25549r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i11, keyEvent);
        }
        return true;
    }

    @Override // k.y, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e eVar = this.f25563a;
        eVar.f25536d = charSequence;
        TextView textView = eVar.f25552u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
