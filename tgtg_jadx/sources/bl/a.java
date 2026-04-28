package bl;

import a8.k;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.o0;
import androidx.fragment.app.y;
import ax.s;
import com.app.tgtg.R;
import h0.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import o00.x0;
import pg.x;
import pj.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbl/a;", "Landroidx/fragment/app/y;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCookiesDetailDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookiesDetailDialogFragment.kt\ncom/app/tgtg/feature/login/cookies/CookiesDetailDialogFragment\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n27#2:150\n1915#3:151\n1915#3,2:152\n1915#3,2:154\n1915#3,2:156\n1916#3:158\n*S KotlinDebug\n*F\n+ 1 CookiesDetailDialogFragment.kt\ncom/app/tgtg/feature/login/cookies/CookiesDetailDialogFragment\n*L\n61#1:150\n76#1:151\n86#1:152,2\n94#1:154,2\n102#1:156,2\n76#1:158\n*E\n"})
public final class a extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f6331a;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i11 = x.f35256v;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        x xVar = (x) k.Z(layoutInflater, R.layout.cookies_detail_dialog_fragment, viewGroup, false, null);
        this.f6331a = xVar;
        xVar.getClass();
        View view = xVar.f986f;
        view.getClass();
        return view;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        x0.l(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            pj.b bVar = (pj.b) g.t(arguments, "Details", pj.b.class);
            x xVar = this.f6331a;
            xVar.getClass();
            LinearLayout linearLayout = xVar.f35258t;
            linearLayout.removeAllViews();
            if (bVar != null) {
                xVar.f35259u.setText(bVar.f35418b);
                linearLayout.addView(p(bVar.f35419c));
                for (pj.e eVar : bVar.f35420d) {
                    linearLayout.addView(p(eVar.f35426a));
                    pj.c cVar = eVar.f35427b;
                    if (cVar != null) {
                        o0 o0VarRequireActivity = requireActivity();
                        o0VarRequireActivity.getClass();
                        gr.c cVar2 = new gr.c(o0VarRequireActivity);
                        cVar2.setContent(cVar);
                        linearLayout.addView(cVar2);
                    }
                    ArrayList arrayList = eVar.f35428c;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            gr.a aVar = new gr.a(requireActivity());
                            aVar.setTitle(iIntValue);
                            linearLayout.addView(aVar);
                        }
                    }
                    ArrayList<f> arrayList2 = eVar.f35429d;
                    if (arrayList2 != null) {
                        for (f fVar : arrayList2) {
                            o0 o0VarRequireActivity2 = requireActivity();
                            o0VarRequireActivity2.getClass();
                            gr.b bVar2 = new gr.b(o0VarRequireActivity2);
                            bVar2.setContent(fVar);
                            linearLayout.addView(bVar2);
                        }
                    }
                    ArrayList<pj.d> arrayList3 = eVar.f35430e;
                    if (arrayList3 != null) {
                        for (pj.d dVar : arrayList3) {
                            gr.a aVar2 = new gr.a(requireActivity());
                            aVar2.setContent(m0.c.c0("<b>" + requireContext().getString(dVar.f35424a) + "</b> " + requireContext().getString(dVar.f35425b)));
                            linearLayout.addView(aVar2);
                        }
                    }
                }
                linearLayout.requestLayout();
            }
        } else {
            Toast.makeText(requireContext(), getString(R.string.generic_err_undefined_error), 0).show();
            dismiss();
        }
        x xVar2 = this.f6331a;
        xVar2.getClass();
        xVar2.f35257s.setOnClickListener(new s(this, 5));
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    public final TextView p(int i11) {
        TextView textView = new TextView(requireActivity());
        textView.setText(i11);
        textView.setTextAppearance(R.style.Body1_Bold_Green);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(d70.b.a(16), d70.b.a(16), d70.b.a(16), d70.b.a(6));
        textView.setLayoutParams(layoutParams);
        return textView;
    }
}
