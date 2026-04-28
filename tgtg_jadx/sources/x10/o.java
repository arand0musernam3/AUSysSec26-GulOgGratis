package x10;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f43709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1.a f43710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43711c;

    public o(ContextThemeWrapper contextThemeWrapper, b bVar, m1.a aVar) {
        l lVar = bVar.f43641a;
        l lVar2 = bVar.f43642b;
        l lVar3 = bVar.f43644d;
        if (lVar.f43695a.compareTo(lVar3.f43695a) > 0) {
            i4.a.f("firstPage cannot be after currentPage");
            throw null;
        }
        if (lVar3.f43695a.compareTo(lVar2.f43695a) > 0) {
            i4.a.f("currentPage cannot be after lastPage");
            throw null;
        }
        this.f43711c = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * m.f43702d) + (j.r(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f43709a = bVar;
        this.f43710b = aVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        return this.f43709a.f43647g;
    }

    @Override // androidx.recyclerview.widget.l1
    public final long getItemId(int i11) {
        Calendar calendarA = r.a(this.f43709a.f43641a.f43695a);
        calendarA.add(2, i11);
        calendarA.set(5, 1);
        Calendar calendarA2 = r.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        n nVar = (n) r2Var;
        b bVar = this.f43709a;
        Calendar calendarA = r.a(bVar.f43641a.f43695a);
        calendarA.add(2, i11);
        l lVar = new l(calendarA);
        nVar.f43707a.setText(lVar.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) nVar.f43708b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !lVar.equals(materialCalendarGridView.a().f43704a)) {
            new m(lVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!j.r(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new n(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.a(-1, this.f43711c));
        return new n(linearLayout, true);
    }
}
