# Exploratory Testing

## Charters

Charter 1: Test the expense tracking feature

- Goal: Identify any issues or errors that may occur when adding, editing, or deleting expenses

- Focus: User interface, accuracy of calculations, and data persistence across sessions

- Approach: Use various input methods (e.g. manual entry, OCR, voice recognition) to add, edit, and delete expenses with different values, categories, and dates

- Environment: Use the latest version of Monefy on an Android device

Charter 2: Test the Income feature

- Goal: Identify any issues or errors that may occur when dding, editing, or deleting incomes

- Focus: User interface, accuracy of calculations, and data persistence across sessions

- Approach: Use various input methods (e.g. manual entry, OCR, voice recognition) to add, edit, and delete expenses with different values, categories, and dates

- Environment: Use the latest version of Monefy on an Android device

Charter 3: Test the reporting feature

- Goal: Identify any issues or errors that may occur when generating reports on expenses and income

- Focus: User interface, accuracy of calculations, and customization options for reports

- Approach: Generate reports for different time periods (e.g. daily, weekly, monthly), categories, and currencies, and verify that the results are accurate and match the user's input

- Environment: Use the latest version of Monefy on an Android device

## Findings

The income doesn’t get moved to one month to another, at least automatically when added on the previous month \
Evidence [here](https://drive.google.com/file/d/1ZLD4w-oF249WqbYj8LLhWlBKWpqjlsCG/view?usp=share_link) and [here](https://drive.google.com/file/d/1ILU1fMfopKFSqtTKFvltu_-pCaNZ0CQ9/view?usp=share_link) \
Severity: Medium


When you write the amount, a custom numeric keyboard is shown but it has operational buttons that are not working \
Evidence [here](https://drive.google.com/file/d/1BEg-N0In_kafjLBHD-GEz5N1ojFf-9n3/view?usp=share_link) \
Severity : Medium

You have to tap on the “main currency” label to change the currency and it is a little confusing \
Evidence [here](https://drive.google.com/file/d/1FL4cmee5NQYfhzgRLW5RJg_A7j2Pu9cC/view?usp=sharing) \
Severity: Minor

When you add income or expense the amount it doesn't have a coma or point separator to have a more clear understanding of the amount of the transaction, this is especially helpful on currencies that manage a big amount of numbers like Ghanaian Cedi \
Evidence [here](https://drive.google.com/file/d/1BEg-N0In_kafjLBHD-GEz5N1ojFf-9n3/view?usp=share_link) \
Severity: Medium

When you change the account, the time interval is remaining, I think that the interval should be linked to the account \
Evidence [here](https://drive.google.com/file/d/1cmLZT7TSs5l7xwOx63lfjMjFAfihJAEi/view?usp=share_link) \
Severity: Medium

When you change the first day of the month it remains when you change the account it should be linked to the account \
Evidence [here](https://drive.google.com/file/d/1Jg4crSzQ9KJvZO43YpdqKZrqwrMfcge1/view?usp=share_link) \
Severity: Medium
