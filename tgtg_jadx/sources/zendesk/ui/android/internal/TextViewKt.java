package zendesk.ui.android.internal;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import i80.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aA\u0010\u0007\u001a\u00020\u0006*\u00020\u00002(\b\u0004\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002(\b\u0004\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a/\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0016\b\u0004\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0083\u0001\u0010\u0011\u001a\u00020\u0006*\u00020\u00002(\b\u0006\u0010\u000e\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012(\b\u0006\u0010\u000f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0016\b\u0006\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "", "", "action", "Landroid/text/TextWatcher;", "doBeforeTextChanged", "(Landroid/widget/TextView;Li80/o;)Landroid/text/TextWatcher;", "doOnTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "doAfterTextChanged", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)Landroid/text/TextWatcher;", "beforeTextChanged", "onTextChanged", "afterTextChanged", "addTextChangedListener", "(Landroid/widget/TextView;Li80/o;Li80/o;Lkotlin/jvm/functions/Function1;)Landroid/text/TextWatcher;", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nzendesk/ui/android/internal/TextViewKt\n*L\n1#1,95:1\n64#1:96\n76#1,4:97\n92#1,2:101\n64#1,16:103\n92#1,2:119\n64#1,16:121\n92#1,2:137\n*S KotlinDebug\n*F\n+ 1 TextView.kt\nzendesk/ui/android/internal/TextViewKt\n*L\n34#1:96\n34#1:97,4\n34#1:101,2\n48#1:103,16\n48#1:119,2\n57#1:121,16\n57#1:137,2\n*E\n"})
public final class TextViewKt {
    @NotNull
    public static final TextWatcher addTextChangedListener(@NotNull TextView textView, @NotNull o oVar, @NotNull o oVar2, @NotNull Function1<? super Editable, Unit> function1) {
        textView.getClass();
        oVar.getClass();
        oVar2.getClass();
        function1.getClass();
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, oVar, oVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, o oVar, o oVar2, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            oVar = new o() { // from class: zendesk.ui.android.internal.TextViewKt.addTextChangedListener.1
                @Override // i80.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke((CharSequence) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
                    return Unit.f26487a;
                }

                public final void invoke(CharSequence charSequence, int i12, int i13, int i14) {
                }
            };
        }
        if ((i11 & 2) != 0) {
            oVar2 = new o() { // from class: zendesk.ui.android.internal.TextViewKt.addTextChangedListener.2
                @Override // i80.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke((CharSequence) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
                    return Unit.f26487a;
                }

                public final void invoke(CharSequence charSequence, int i12, int i13, int i14) {
                }
            };
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1<Editable, Unit>() { // from class: zendesk.ui.android.internal.TextViewKt.addTextChangedListener.3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Editable) obj2);
                    return Unit.f26487a;
                }

                public final void invoke(Editable editable) {
                }
            };
        }
        textView.getClass();
        oVar.getClass();
        oVar2.getClass();
        function1.getClass();
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, oVar, oVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    @NotNull
    public static final TextWatcher doAfterTextChanged(@NotNull TextView textView, @NotNull final Function1<? super Editable, Unit> function1) {
        textView.getClass();
        function1.getClass();
        TextWatcher textWatcher = new TextWatcher() { // from class: zendesk.ui.android.internal.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s7) {
                function1.invoke(s7);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    @NotNull
    public static final TextWatcher doBeforeTextChanged(@NotNull TextView textView, @NotNull final o oVar) {
        textView.getClass();
        oVar.getClass();
        TextWatcher textWatcher = new TextWatcher() { // from class: zendesk.ui.android.internal.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                oVar.invoke(text, Integer.valueOf(start), Integer.valueOf(count), Integer.valueOf(after));
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s7) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    @NotNull
    public static final TextWatcher doOnTextChanged(@NotNull TextView textView, @NotNull final o oVar) {
        textView.getClass();
        oVar.getClass();
        TextWatcher textWatcher = new TextWatcher() { // from class: zendesk.ui.android.internal.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                oVar.invoke(text, Integer.valueOf(start), Integer.valueOf(before), Integer.valueOf(count));
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s7) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
