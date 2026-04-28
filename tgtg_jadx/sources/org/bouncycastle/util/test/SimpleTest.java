package org.bouncycastle.util.test;

import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SimpleTest implements Test {

    public interface TestExceptionOperation {
        void operation() throws Exception;
    }

    public static void runTest(Test test, PrintStream printStream) {
        TestResult testResultPerform = test.perform();
        if (testResultPerform.getException() != null) {
            testResultPerform.getException().printStackTrace(printStream);
        }
        printStream.println(testResultPerform);
    }

    public static void runTests(Test[] testArr, PrintStream printStream) {
        Vector vector = new Vector();
        for (int i11 = 0; i11 != testArr.length; i11++) {
            TestResult testResultPerform = testArr[i11].perform();
            if (!testResultPerform.isSuccessful()) {
                vector.addElement(testResultPerform);
            }
            if (testResultPerform.getException() != null) {
                testResultPerform.getException().printStackTrace(printStream);
            }
            printStream.println(testResultPerform);
        }
        printStream.println("-----");
        if (vector.isEmpty()) {
            printStream.println("All tests successful.");
            return;
        }
        printStream.println("Completed with " + vector.size() + " FAILURES:");
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            System.out.println("=>  " + ((TestResult) enumerationElements.nextElement()));
        }
    }

    private TestResult success() {
        return SimpleTestResult.successful(this, "Okay");
    }

    public boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (!areEqual(bArr[i11], bArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public void fail(String str) {
        throw new TestFailedException(SimpleTestResult.failed(this, str));
    }

    @Override // org.bouncycastle.util.test.Test
    public abstract String getName();

    public void isEquals(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
        if (obj2 == null) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
        if (!obj.equals(obj2)) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    public void isTrue(boolean z11) {
        if (!z11) {
            throw new TestFailedException(SimpleTestResult.failed(this, "no message"));
        }
    }

    @Override // org.bouncycastle.util.test.Test
    public TestResult perform() {
        try {
            performTest();
            return success();
        } catch (TestFailedException e5) {
            return e5.getResult();
        } catch (Exception e11) {
            return SimpleTestResult.failed(this, "Exception: " + e11, e11);
        }
    }

    public abstract void performTest() throws Exception;

    public Exception testException(String str, String str2, TestExceptionOperation testExceptionOperation) {
        try {
            testExceptionOperation.operation();
            fail(str);
            return null;
        } catch (Exception e5) {
            if (str != null) {
                isTrue(e5.getMessage(), e5.getMessage().indexOf(str) >= 0);
            }
            isTrue(e5.getMessage(), e5.getClass().getName().indexOf(str2) >= 0);
            return e5;
        }
    }

    public void fail(String str, Object obj, Object obj2) {
        throw new TestFailedException(SimpleTestResult.failed(this, str, obj, obj2));
    }

    public void fail(String str, Throwable th2) {
        throw new TestFailedException(SimpleTestResult.failed(this, str, th2));
    }

    public void isTrue(String str, boolean z11) {
        if (!z11) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    public static void runTest(Test test) {
        runTest(test, System.out);
    }

    public boolean areEqual(byte[] bArr, byte[] bArr2) {
        return Arrays.areEqual(bArr, bArr2);
    }

    public boolean areEqual(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        return Arrays.areEqual(bArr, i11, i12, bArr2, i13, i14);
    }

    public void isEquals(long j9, long j11) {
        if (j9 != j11) {
            throw new TestFailedException(SimpleTestResult.failed(this, "no message"));
        }
    }

    public void isEquals(Object obj, Object obj2) {
        if (!obj.equals(obj2)) {
            throw new TestFailedException(SimpleTestResult.failed(this, "no message"));
        }
    }

    public void isEquals(String str, long j9, long j11) {
        if (j9 != j11) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    public void isEquals(int i11, int i12) {
        if (i11 != i12) {
            throw new TestFailedException(SimpleTestResult.failed(this, "no message"));
        }
    }

    public void isEquals(String str, boolean z11, boolean z12) {
        if (z11 != z12) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    public void isEquals(boolean z11, boolean z12) {
        if (z11 != z12) {
            throw new TestFailedException(SimpleTestResult.failed(this, "no message"));
        }
    }

    public static void runTests(Test[] testArr) {
        runTests(testArr, System.out);
    }
}
