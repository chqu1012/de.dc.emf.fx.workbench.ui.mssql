/**
 */
package de.dc.emf.fx.workbench.ui.mssql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sql Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getSqlType()
 * @model
 * @generated
 */
public enum SqlType implements Enumerator {
	/**
	 * The '<em><b>BIG INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_INT_VALUE
	 * @generated
	 * @ordered
	 */
	BIG_INT(0, "BIG_INT", "BIG_INT"),

	/**
	 * The '<em><b>NUMERIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC(0, "NUMERIC", "NUMERIC"),

	/**
	 * The '<em><b>BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_VALUE
	 * @generated
	 * @ordered
	 */
	BIT(0, "BIT", "BIT"),

	/**
	 * The '<em><b>SMALL INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_INT_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_INT(0, "SMALL_INT", "SMALL_INT"),

	/**
	 * The '<em><b>DECIMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(0, "DECIMAL", "DECIMAL"),

	/**
	 * The '<em><b>SMALL MONEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_MONEY_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_MONEY(0, "SMALL_MONEY", "SMALL_MONEY"),

	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(0, "INT", "INT"),

	/**
	 * The '<em><b>TINY INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TINY_INT_VALUE
	 * @generated
	 * @ordered
	 */
	TINY_INT(0, "TINY_INT", "TINY_INT"),

	/**
	 * The '<em><b>MONEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONEY_VALUE
	 * @generated
	 * @ordered
	 */
	MONEY(0, "MONEY", "MONEY"),

	/**
	 * The '<em><b>FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(0, "FLOAT", "FLOAT"),

	/**
	 * The '<em><b>REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(0, "REAL", "REAL"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(0, "DATE", "DATE"),

	/**
	 * The '<em><b>DATETIME2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME2_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME2(0, "DATETIME2", "DATETIME2"),

	/**
	 * The '<em><b>DATETIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME(0, "DATETIME", "DATETIME"),

	/**
	 * The '<em><b>DATETIME OFFSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_OFFSET_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_OFFSET(0, "DATETIME_OFFSET", "DATETIME_OFFSET"),

	/**
	 * The '<em><b>SMALL DATETIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_DATETIME_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_DATETIME(0, "SMALL_DATETIME", "SMALL_DATETIME"),

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(0, "TIME", "TIME"),

	/**
	 * The '<em><b>CHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	CHAR(0, "CHAR", "CHAR"),

	/**
	 * The '<em><b>TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(0, "TEXT", "TEXT"),

	/**
	 * The '<em><b>VARCHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	VARCHAR(0, "VARCHAR", "VARCHAR"),

	/**
	 * The '<em><b>NCHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	NCHAR(0, "NCHAR", "NCHAR"),

	/**
	 * The '<em><b>NTEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	NTEXT(0, "NTEXT", "NTEXT"),

	/**
	 * The '<em><b>BINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(0, "BINARY", "BINARY"),

	/**
	 * The '<em><b>IMAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE(0, "IMAGE", "IMAGE"),

	/**
	 * The '<em><b>VARBINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARBINARY_VALUE
	 * @generated
	 * @ordered
	 */
	VARBINARY(0, "VARBINARY", "VARBINARY");

	/**
	 * The '<em><b>BIG INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIG_INT_VALUE = 0;

	/**
	 * The '<em><b>NUMERIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_VALUE = 0;

	/**
	 * The '<em><b>BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIT_VALUE = 0;

	/**
	 * The '<em><b>SMALL INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_INT_VALUE = 0;

	/**
	 * The '<em><b>DECIMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 0;

	/**
	 * The '<em><b>SMALL MONEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_MONEY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_MONEY_VALUE = 0;

	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 0;

	/**
	 * The '<em><b>TINY INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TINY_INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TINY_INT_VALUE = 0;

	/**
	 * The '<em><b>MONEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONEY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONEY_VALUE = 0;

	/**
	 * The '<em><b>FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 0;

	/**
	 * The '<em><b>REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 0;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 0;

	/**
	 * The '<em><b>DATETIME2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME2_VALUE = 0;

	/**
	 * The '<em><b>DATETIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_VALUE = 0;

	/**
	 * The '<em><b>DATETIME OFFSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_OFFSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_OFFSET_VALUE = 0;

	/**
	 * The '<em><b>SMALL DATETIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_DATETIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_DATETIME_VALUE = 0;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 0;

	/**
	 * The '<em><b>CHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHAR_VALUE = 0;

	/**
	 * The '<em><b>TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 0;

	/**
	 * The '<em><b>VARCHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARCHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARCHAR_VALUE = 0;

	/**
	 * The '<em><b>NCHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NCHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NCHAR_VALUE = 0;

	/**
	 * The '<em><b>NTEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NTEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NTEXT_VALUE = 0;

	/**
	 * The '<em><b>BINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 0;

	/**
	 * The '<em><b>IMAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_VALUE = 0;

	/**
	 * The '<em><b>VARBINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARBINARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARBINARY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Sql Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SqlType[] VALUES_ARRAY = new SqlType[] { BIG_INT, NUMERIC, BIT, SMALL_INT, DECIMAL,
			SMALL_MONEY, INT, TINY_INT, MONEY, FLOAT, REAL, DATE, DATETIME2, DATETIME, DATETIME_OFFSET, SMALL_DATETIME,
			TIME, CHAR, TEXT, VARCHAR, NCHAR, NTEXT, BINARY, IMAGE, VARBINARY, };

	/**
	 * A public read-only list of all the '<em><b>Sql Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SqlType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sql Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SqlType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SqlType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sql Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SqlType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SqlType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sql Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SqlType get(int value) {
		switch (value) {
		case BIG_INT_VALUE:
			return BIG_INT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SqlType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SqlType
