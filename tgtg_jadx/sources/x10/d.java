package x10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.app.tgtg.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f43649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43651c;

    public d() {
        Calendar calendarC = r.c(null);
        this.f43649a = calendarC;
        this.f43650b = calendarC.getMaximum(7);
        this.f43651c = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f43650b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i11) {
        int i12 = this.f43650b;
        if (i11 >= i12) {
            return null;
        }
        int i13 = i11 + this.f43651c;
        if (i13 > i12) {
            i13 -= i12;
        }
        return Integer.valueOf(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i12 = i11 + this.f43651c;
        int i13 = this.f43650b;
        if (i12 > i13) {
            i12 -= i13;
        }
        Calendar calendar = this.f43649a;
        calendar.set(7, i12);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public d(int i11) {
        Calendar calendarC = r.c(null);
        this.f43649a = calendarC;
        this.f43650b = calendarC.getMaximum(7);
        this.f43651c = i11;
    }
}
