package zendesk.ui.android.conversation.form;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.R;
import zendesk.ui.android.internal.ColorExtKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u0011*\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010 \u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010)\u001a\u00020\u0013H\u0000¢\u0006\u0004\b(\u0010&J\u0017\u0010-\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u0002H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u00100\u001a\u00020\u0002H\u0000¢\u0006\u0004\b.\u0010/J\u0011\u00103\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b1\u00102J\u000f\u00105\u001a\u00020\u0013H\u0000¢\u0006\u0004\b4\u0010&J\u000f\u00109\u001a\u000206H\u0000¢\u0006\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010>\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldInputArrayAdapter;", "Landroid/widget/ArrayAdapter;", "Lzendesk/ui/android/conversation/form/SelectOption;", "Landroid/widget/Filterable;", "Landroid/content/Context;", "context", "", "layoutResource", "", "allMenuOptions", "focusedBorderColor", "<init>", "(Landroid/content/Context;ILjava/util/List;Ljava/lang/Integer;)V", "", "query", "getSuggestions", "(Ljava/lang/String;)Ljava/util/List;", "Landroid/widget/CheckedTextView;", "position", "", "disableIfNoMatchesFound", "(Landroid/widget/CheckedTextView;I)V", "Landroid/view/View;", "Landroid/view/ViewGroup;", "parent", "toCheckedTextView", "(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/widget/CheckedTextView;", "getCount", "()I", "getItem", "(I)Lzendesk/ui/android/conversation/form/SelectOption;", "convertView", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "resetSuggestions$zendesk_ui_ui_android", "()V", "resetSuggestions", "performFilterOnInvalidTypedQuery$zendesk_ui_ui_android", "performFilterOnInvalidTypedQuery", "selectedOption", "setCurrentSelectedOption$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/form/SelectOption;)V", "setCurrentSelectedOption", "getCurrentSelectedOption$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/form/SelectOption;", "getCurrentSelectedOption", "getInvalidTypedTextQuery$zendesk_ui_ui_android", "()Ljava/lang/String;", "getInvalidTypedTextQuery", "resetInvalidTypedTextQuery$zendesk_ui_ui_android", "resetInvalidTypedTextQuery", "", "hasValidSuggestions$zendesk_ui_ui_android", "()Z", "hasValidSuggestions", "I", "Ljava/util/List;", "Ljava/lang/Integer;", "suggestedMenuOptions", "noMatchesFound", "Lzendesk/ui/android/conversation/form/SelectOption;", "currentSelectedOption", "invalidTypedTextQuery", "Ljava/lang/String;", "Ln20/j;", "focusedBackground", "Ln20/j;", "getFocusedBackground", "()Ln20/j;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFieldInputArrayAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldInputArrayAdapter.kt\nzendesk/ui/android/conversation/form/FieldInputArrayAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n774#2:202\n865#2,2:203\n*S KotlinDebug\n*F\n+ 1 FieldInputArrayAdapter.kt\nzendesk/ui/android/conversation/form/FieldInputArrayAdapter\n*L\n166#1:202\n166#1:203,2\n*E\n"})
public final class FieldInputArrayAdapter extends ArrayAdapter<SelectOption> implements Filterable {
    public static final int $stable = 8;

    @NotNull
    private final List<SelectOption> allMenuOptions;
    private SelectOption currentSelectedOption;

    @NotNull
    private final n20.j focusedBackground;

    @Nullable
    private final Integer focusedBorderColor;

    @Nullable
    private String invalidTypedTextQuery;
    private final int layoutResource;

    @NotNull
    private final SelectOption noMatchesFound;

    @NotNull
    private List<SelectOption> suggestedMenuOptions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldInputArrayAdapter(@NotNull Context context, int i11, @NotNull List<SelectOption> list, @Nullable Integer num) {
        super(context, i11, list);
        context.getClass();
        list.getClass();
        this.layoutResource = i11;
        this.allMenuOptions = list;
        this.focusedBorderColor = num;
        this.suggestedMenuOptions = list;
        String string = context.getString(R.string.zuia_no_matches_found_label);
        string.getClass();
        this.noMatchesFound = new SelectOption("", string, 0, 4, null);
        n20.j jVarE = n20.j.e(context, 0.0f, null);
        jVarE.A(context.getResources().getDimension(R.dimen.zuia_border_width));
        jVarE.z(ColorStateList.valueOf(num != null ? num.intValue() : ColorExtKt.resolveColorAttr(context, com.app.tgtg.R.attr.colorAccent)));
        this.focusedBackground = jVarE;
    }

    private final void disableIfNoMatchesFound(CheckedTextView checkedTextView, int i11) {
        boolean zAreEqual = Intrinsics.areEqual(getItem(i11).getLabel(), this.noMatchesFound.getLabel());
        checkedTextView.setClickable(zAreEqual);
        checkedTextView.setEnabled(!zAreEqual);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SelectOption> getSuggestions(String query) {
        if (query == null || query.length() == 0) {
            return this.allMenuOptions;
        }
        List<SelectOption> list = this.allMenuOptions;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String label = ((SelectOption) obj).getLabel();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = label.toLowerCase(locale);
            lowerCase.getClass();
            if (StringsKt.z(lowerCase, query, false)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.invalidTypedTextQuery = query;
        return c0.c(this.noMatchesFound);
    }

    private final CheckedTextView toCheckedTextView(View view, ViewGroup viewGroup) {
        CheckedTextView checkedTextView = view instanceof CheckedTextView ? (CheckedTextView) view : null;
        if (checkedTextView != null) {
            return checkedTextView;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(this.layoutResource, viewGroup, false);
        viewInflate.getClass();
        return (CheckedTextView) viewInflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.suggestedMenuOptions.size();
    }

    @NotNull
    public final SelectOption getCurrentSelectedOption$zendesk_ui_ui_android() {
        SelectOption selectOption = this.currentSelectedOption;
        if (selectOption != null) {
            return selectOption;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currentSelectedOption");
        return null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return new Filter() { // from class: zendesk.ui.android.conversation.form.FieldInputArrayAdapter.getFilter.1
            @Override // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence) {
                String lowerCase;
                String string;
                if (charSequence == null || (string = charSequence.toString()) == null) {
                    lowerCase = null;
                } else {
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    lowerCase = string.toLowerCase(locale);
                    lowerCase.getClass();
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = FieldInputArrayAdapter.this.getSuggestions(lowerCase);
                return filterResults;
            }

            @Override // android.widget.Filter
            public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                filterResults.getClass();
                FieldInputArrayAdapter fieldInputArrayAdapter = FieldInputArrayAdapter.this;
                Object obj = filterResults.values;
                obj.getClass();
                fieldInputArrayAdapter.suggestedMenuOptions = (List) obj;
                FieldInputArrayAdapter.this.notifyDataSetChanged();
            }
        };
    }

    @NotNull
    public final n20.j getFocusedBackground() {
        return this.focusedBackground;
    }

    @Nullable
    /* JADX INFO: renamed from: getInvalidTypedTextQuery$zendesk_ui_ui_android, reason: from getter */
    public final String getInvalidTypedTextQuery() {
        return this.invalidTypedTextQuery;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NotNull
    public SelectOption getItem(int position) {
        return this.suggestedMenuOptions.get(position);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
        parent.getClass();
        final CheckedTextView checkedTextView = toCheckedTextView(convertView, parent);
        SelectOption item = getItem(position);
        checkedTextView.setText(item.getLabel());
        checkedTextView.setTextColor(item.getTextColor());
        disableIfNoMatchesFound(checkedTextView, position);
        checkedTextView.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: zendesk.ui.android.conversation.form.FieldInputArrayAdapter.getView.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                if (info.isAccessibilityFocused() && !Intrinsics.areEqual(checkedTextView.getBackground(), this.getFocusedBackground())) {
                    checkedTextView.setBackground(this.getFocusedBackground());
                } else {
                    if (info.isAccessibilityFocused() || !Intrinsics.areEqual(checkedTextView.getBackground(), this.getFocusedBackground())) {
                        return;
                    }
                    checkedTextView.setBackground(null);
                }
            }
        });
        return checkedTextView;
    }

    public final boolean hasValidSuggestions$zendesk_ui_ui_android() {
        return (this.suggestedMenuOptions.isEmpty() || Intrinsics.areEqual(this.suggestedMenuOptions.get(0).getLabel(), this.noMatchesFound.getLabel())) ? false : true;
    }

    public final void performFilterOnInvalidTypedQuery$zendesk_ui_ui_android() {
        String str = this.invalidTypedTextQuery;
        if (str == null || str.length() == 0) {
            return;
        }
        getFilter().filter(this.invalidTypedTextQuery);
    }

    public final void resetInvalidTypedTextQuery$zendesk_ui_ui_android() {
        if (this.invalidTypedTextQuery != null) {
            this.invalidTypedTextQuery = null;
        }
    }

    public final void resetSuggestions$zendesk_ui_ui_android() {
        if (this.suggestedMenuOptions.size() != this.allMenuOptions.size()) {
            getFilter().filter(null);
        }
    }

    public final void setCurrentSelectedOption$zendesk_ui_ui_android(@NotNull SelectOption selectedOption) {
        selectedOption.getClass();
        this.currentSelectedOption = selectedOption;
    }
}
