package br;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.model.remote.brief.BriefOrder;
import java.util.List;
import kotlin.jvm.functions.Function0;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6627a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6630d;

    public i(List list, a aVar, Function0 function0) {
        list.getClass();
        aVar.getClass();
        function0.getClass();
        this.f6628b = list;
        this.f6629c = aVar;
        this.f6630d = function0;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        switch (this.f6627a) {
            case 0:
                return ((List) this.f6628b).size();
            case 1:
                return ((BriefOrder[]) this.f6629c).length;
            default:
                return ((t40.b[]) this.f6629c).length - 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    @Override // androidx.recyclerview.widget.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.r2 r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: br.i.onBindViewHolder(androidx.recyclerview.widget.r2, int):void");
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        switch (this.f6627a) {
            case 0:
                viewGroup.getClass();
                Context context = viewGroup.getContext();
                context.getClass();
                return new g(new m(context, null, 6, 0));
            case 1:
                viewGroup.getClass();
                return new sr.h(new sr.i((ContactUsActivity) this.f6630d, (Context) this.f6628b));
            default:
                viewGroup.getClass();
                return new sr.j(new sr.k((ContactUsActivity) this.f6630d, (Context) this.f6628b));
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public void onViewRecycled(r2 r2Var) {
        switch (this.f6627a) {
            case 0:
                g gVar = (g) r2Var;
                gVar.getClass();
                b2 b2Var = gVar.f6624c;
                if (b2Var != null && b2Var.g()) {
                    b2 b2Var2 = gVar.f6624c;
                    if (b2Var2 != null) {
                        b2Var2.a(null);
                    }
                    gVar.f6624c = null;
                }
                super.onViewRecycled(gVar);
                break;
            default:
                super.onViewRecycled(r2Var);
                break;
        }
    }

    public i(ContactUsActivity contactUsActivity, Context context, t40.b[] bVarArr) {
        this.f6630d = contactUsActivity;
        this.f6628b = context;
        this.f6629c = bVarArr;
    }

    public i(ContactUsActivity contactUsActivity, Context context, BriefOrder[] briefOrderArr) {
        briefOrderArr.getClass();
        this.f6630d = contactUsActivity;
        this.f6628b = context;
        this.f6629c = briefOrderArr;
    }
}
